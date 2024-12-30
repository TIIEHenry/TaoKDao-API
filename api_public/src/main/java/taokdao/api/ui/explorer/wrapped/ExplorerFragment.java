package taokdao.api.ui.explorer.wrapped;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import taokdao.api.base.annotation.relation.MultiConstructor;
import taokdao.api.base.fragment.StateFragment;
import taokdao.api.data.bean.IProperties;
import taokdao.api.setting.preference.base.IPreference;
import taokdao.api.ui.explorer.IExplorer;
import taokdao.api.ui.explorer.menu.ExplorerMenu;


public abstract class ExplorerFragment extends StateFragment implements IExplorer {
    private final String id;
    private final String label;
    private final Drawable icon;

    @LayoutRes
    private int layoutId;

    private View layout = null;
    private ArrayList<ExplorerMenu> menuList = new ArrayList<>();
    private ArrayList<IPreference<?>> settingList = new ArrayList<>();


    @MultiConstructor
    public ExplorerFragment(@NonNull IProperties properties, @Nullable Drawable icon, @NonNull View layout) {
        this.id = properties.id();
        this.label = properties.getLabel();
        this.icon = icon;
        this.layout = layout;
        setObservers();
    }

    public ExplorerFragment(@NonNull IProperties properties, @NonNull View layout) {
        this(properties, null, layout);
    }

    @MultiConstructor
    public ExplorerFragment(@NonNull IProperties properties, @Nullable Drawable icon, int layoutId) {
        this.id = properties.id();
        this.label = properties.getLabel();
        this.icon = icon;
        this.layoutId = layoutId;
        setObservers();
    }

    public ExplorerFragment(@NonNull IProperties properties, int layoutId) {
        this(properties, null, layoutId);
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
    public ArrayList<ExplorerMenu> getMenuList() {
        return menuList;
    }

    @NonNull
    @Override
    protected View getView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container) {
        if (layout != null)
            return layout;
        return inflater.inflate(layoutId, container, false);
    }

    @NonNull
    @Override
    public ArrayList<IPreference<?>> getSettingList() {
        return settingList;
    }

}
