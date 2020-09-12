package taokdao.api.ui.toolpage.fragment;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import taokdao.api.base.annotation.Identifier;
import taokdao.api.base.annotation.relation.MultiConstructor;
import taokdao.api.base.fragment.StateFragment;
import taokdao.api.data.bean.IProperties;
import taokdao.api.setting.preference.base.IPreference;
import taokdao.api.ui.toolpage.callback.ToolPageStateObserver;
import taokdao.api.ui.toolpage.menu.ToolPageMenu;

public abstract class ToolPageFragment extends BaseToolPageFragment {
    @Identifier
    private final String id;
    private final String label;
    private final Drawable icon;

    private final ArrayList<ToolPageMenu> menuList = new ArrayList<>();
    private final ArrayList<IPreference<?>> settingList = new ArrayList<>();


    @LayoutRes
    private int layoutId;

    private View layout = null;

    @MultiConstructor
    public ToolPageFragment(@NonNull IProperties properties, @Nullable Drawable icon, View layout) {
        this.id = properties.id();
        this.label = properties.getLabel();
        this.icon = icon;
        setObservers();
        this.layout = layout;
    }

    public ToolPageFragment(@NonNull IProperties properties, View layout) {
        this(properties, null, layout);
    }

    @MultiConstructor
    public ToolPageFragment(@NonNull IProperties properties, @Nullable Drawable icon, @LayoutRes int layoutId) {
        this.id = properties.id()  ;
        this.label = properties.getLabel();
        this.icon = icon;
        this.layoutId = layoutId;
        setObservers();
    }

    public ToolPageFragment(@NonNull IProperties properties, @LayoutRes int layoutId) {
        this(properties, null, layoutId);
    }

    @NonNull
    @Override
    protected View getView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container) {
        if (layout != null)
            return layout;
        return inflater.inflate(layoutId, container, false);
    }

    private void setObservers() {
        setOnPauseObserver(() -> {
            if (getStateObserver() != null)
                getStateObserver().onHide();
        });
        setOnResumeObserver(() -> {
            if (getStateObserver() != null)
                getStateObserver().onShow();
        });
    }

    @NonNull
    @Identifier
    @Override
    public String id() {
        return id;
    }

    @NonNull
    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public Drawable getIcon() {
        return icon;
    }

    @NonNull
    @Override
    public StateFragment getFragment() {
        return this;
    }

    @NonNull
    @Override
    public ArrayList<ToolPageMenu> getMenuList() {
        return menuList;
    }

    @NonNull
    @Override
    public ArrayList<IPreference<?>> getSettingList() {
        return settingList;
    }

    @Nullable
    @Override
    public ToolPageStateObserver getStateObserver() {
        return null;
    }
}
