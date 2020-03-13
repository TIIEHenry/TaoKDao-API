package androcode.api.ui.windows.tabtool.wrapped;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;

import java.util.ArrayList;

import androcode.api.bean.Properties;
import androcode.api.main.IMainActivity;
import androcode.api.setting.preference.base.IPreference;
import androcode.api.ui.windows.tabtool.ITabTool;
import androcode.api.ui.windows.tabtool.menu.TabToolMenu;
import androcode.base.annotation.Identifier;
import androcode.base.annotation.relation.MultiConstructor;
import androcode.base.fragment.StateFragment;

public abstract class TabToolFragment extends StateFragment implements ITabTool {
    @Identifier
    private final String id;
    private final String label;
    private final Drawable icon;

    private ArrayList<TabToolMenu> menuList = new ArrayList<>();
    private ArrayList<IPreference<?>> settingList = new ArrayList<>();


    @LayoutRes
    private int layoutId;

    private View layout = null;

    @MultiConstructor
    public TabToolFragment(@NonNull Properties properties, @Nullable Drawable icon, View layout) {
        this.id = properties.id;
        this.label = properties.label;
        this.icon = icon;
        setObservers();
        this.layout = layout;
    }

    public TabToolFragment(@NonNull Properties properties, View layout) {
        this(properties,null,layout);
    }

    @MultiConstructor
    public TabToolFragment(@NonNull Properties properties, @Nullable Drawable icon,@LayoutRes int layoutId) {
        this.id = properties.id;
        this.label = properties.label;
        this.icon = icon;
        this.layoutId = layoutId;
        setObservers();
    }

    public TabToolFragment(@NonNull Properties properties,@LayoutRes int layoutId) {
        this(properties,null,layoutId);
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
    public ArrayList<TabToolMenu> getMenuList() {
        return menuList;
    }

    @NonNull
    @Override
    public ArrayList<IPreference<?>> getSettingList() {
        return settingList;
    }

}
