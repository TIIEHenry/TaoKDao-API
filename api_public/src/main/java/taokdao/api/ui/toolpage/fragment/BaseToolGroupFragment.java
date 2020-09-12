package taokdao.api.ui.toolpage.fragment;

import android.graphics.drawable.Drawable;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import taokdao.api.data.bean.IProperties;
import taokdao.api.ui.toolpage.container.IToolTabProvider;
import taokdao.api.ui.toolpage.container.tabchoose.ITabChooserAdapter;
import taokdao.api.ui.toolpage.group.IToolGroup;
import taokdao.api.ui.toolpage.group.tooltab.IToolTab;
import taokdao.api.ui.toolpage.group.tooltab.ToolTabStateObserver;

public abstract class BaseToolGroupFragment<C> extends ToolPageFragment implements IToolGroup<C> {
    private final ArrayList<IToolTabProvider> providerList = new ArrayList<>();
    private final ArrayList<IToolTab<C>> toolTabList = new ArrayList<>();
    private ITabChooserAdapter toolTabAdapter;
    private IToolTab<C> currToolTab;


    public BaseToolGroupFragment(@NonNull IProperties properties, @Nullable Drawable icon, View layout) {
        super(properties, icon, layout);
    }

    public BaseToolGroupFragment(@NonNull IProperties properties, View layout) {
        super(properties, layout);
    }

    public BaseToolGroupFragment(@NonNull IProperties properties, @Nullable Drawable icon, int layoutId) {
        super(properties, icon, layoutId);
    }

    public BaseToolGroupFragment(@NonNull IProperties properties, int layoutId) {
        super(properties, layoutId);
    }

    public abstract void attachContent(C content);

    public abstract boolean isContentAttached(C content);

    public abstract void detachContent(C content);


    @Override
    public void attachAdapter(ITabChooserAdapter toolTabAdapter) {
        this.toolTabAdapter = toolTabAdapter;
    }

    @Override
    public void detachAdapter() {
        this.toolTabAdapter = null;
    }

    @NonNull
    @Override
    public ArrayList<IToolTabProvider> getToolTabProviderList() {
        return providerList;
    }

    @Override
    public void add(@NonNull IToolTab<C> toolTab, boolean select) {
        toolTabList.add(toolTab);
        if (toolTabAdapter != null) {
            toolTabAdapter.add(toolTab, select);
        }
        ToolTabStateObserver observer = toolTab.getStateObserver();
        if (observer != null) {
            observer.onAdded();
        }
    }

    @Override
    public boolean remove(@NonNull IToolTab<C> toolTab) {
        boolean removed = toolTabList.remove(toolTab);
        if (removed) {
            removeFromContainer(toolTab);
            if (toolTabAdapter != null) {
                toolTabAdapter.remove(toolTab);
            }
            ToolTabStateObserver observer = toolTab.getStateObserver();
            if (observer != null) {
                observer.onRemoved();
            }
        }
        return removed;
    }

    @Override
    public void clear() {
        currToolTab = null;
        toolTabList.clear();
        if (toolTabAdapter != null) {
            toolTabAdapter.clear();
        }
        for (IToolTab<C> toolTab : getAll()) {
            if (isContentAttached(toolTab.getContent())) {
                detachContent(toolTab.getContent());
                ToolTabStateObserver observer = toolTab.getStateObserver();
                if (observer != null) {
                    observer.onRemoved();
                }
            }
        }
    }

    private void removeFromContainer(IToolTab<C> toolTab) {
        clearContainer();
    }

    private void clearContainer() {
        for (IToolTab<C> toolTab : getAll()) {
            if (isContentAttached(toolTab.getContent())) {
                detachContent(toolTab.getContent());
                ToolTabStateObserver observer = toolTab.getStateObserver();
                if (observer != null) {
                    observer.onHidden();
                }
            }
        }
    }

    @Override
    public void show(@NonNull IToolTab<C> toolTab) {
        showInContainer(toolTab);
        if (toolTabAdapter != null) {
            toolTabAdapter.show(toolTab);
        }
        ToolTabStateObserver observer = toolTab.getStateObserver();
        if (observer != null) {
            observer.onShown();
        }
    }

    private void showInContainer(IToolTab<C> toolTab) {
        clearContainer();
        currToolTab = toolTab;
        attachContent(toolTab.getContent());
    }


    @NonNull
    @Override
    public List<IToolTab<C>> getAll() {
        return toolTabList;
    }

    @Nullable
    @Override
    public IToolTab<C> getCurrent() {
        return currToolTab;
    }
}
