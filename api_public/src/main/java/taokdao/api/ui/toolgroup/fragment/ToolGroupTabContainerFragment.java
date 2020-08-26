package taokdao.api.ui.toolgroup.fragment;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import taokdao.api.data.bean.IProperties;
import taokdao.api.ui.toolgroup.container.IToolTabContainer;
import taokdao.api.ui.toolgroup.container.IToolTabProvider;
import taokdao.api.ui.toolgroup.container.tabchoose.ITabChooserAdapter;
import taokdao.api.ui.toolgroup.tooltab.IToolTab;
import taokdao.api.ui.toolgroup.tooltab.ToolTabStateObserver;

public abstract class ToolGroupTabContainerFragment extends ToolGroupFragment implements IToolTabContainer {
    private ArrayList<IToolTabProvider> providerList = new ArrayList<>();
    private ArrayList<IToolTab> toolTabList = new ArrayList<>();
    private ITabChooserAdapter toolTabAdapter;
    private IToolTab currToolTab;


    public ToolGroupTabContainerFragment(@NonNull IProperties properties, @Nullable Drawable icon, View layout) {
        super(properties, icon, layout);
    }

    public ToolGroupTabContainerFragment(@NonNull IProperties properties, View layout) {
        super(properties, layout);
    }

    public ToolGroupTabContainerFragment(@NonNull IProperties properties, @Nullable Drawable icon, int layoutId) {
        super(properties, icon, layoutId);
    }

    public ToolGroupTabContainerFragment(@NonNull IProperties properties, int layoutId) {
        super(properties, layoutId);
    }

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
    public void add(@NonNull IToolTab toolTab, boolean select) {
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
    public boolean remove(@NonNull IToolTab toolTab) {
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
        getViewContainer().removeAllViews();
        for (IToolTab toolTab : getAll()) {
            ToolTabStateObserver observer = toolTab.getStateObserver();
            if (observer != null) {
                observer.onRemoved();
            }
        }
    }

    private void removeFromContainer(IToolTab toolTab) {
        clearContainer();
    }

    private void clearContainer() {
        for (IToolTab toolTab : getAll()) {
            ViewParent parent = toolTab.getContent().getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(toolTab.getContent());
                ToolTabStateObserver observer = toolTab.getStateObserver();
                if (observer != null) {
                    observer.onHidden();
                }
            }
        }
    }

    @Override
    public void show(@NonNull IToolTab toolTab) {
        showInContainer(toolTab);
        if (toolTabAdapter != null) {
            toolTabAdapter.show(toolTab);
        }
        ToolTabStateObserver observer = toolTab.getStateObserver();
        if (observer != null) {
            observer.onShown();
        }
    }

    private void showInContainer(IToolTab toolTab) {
        clearContainer();
        currToolTab = toolTab;
        getViewContainer().addView(toolTab.getContent(), -1, -1);
    }

    public abstract ViewGroup getViewContainer();

    @NonNull
    @Override
    public List<IToolTab> getAll() {
        return toolTabList;
    }

    @Nullable
    @Override
    public IToolTab getCurrent() {
        return currToolTab;
    }
}
