package taokdao.api.ui.window.explorer.wrapped;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import taokdao.api.data.bean.Properties;
import taokdao.api.setting.preference.base.IPreference;
import taokdao.api.ui.window.explorer.IExplorer;
import taokdao.api.ui.window.explorer.menu.ExplorerMenu;
import taokdao.api.base.annotation.relation.MainConstructor;
import taokdao.api.base.fragment.StateFragment;

public class Explorer implements IExplorer {
    private final String id;
    private final String label;
    private final Drawable icon;
    private final StateFragment fragment;
    private ArrayList<ExplorerMenu> menuList = new ArrayList<>();
    private ArrayList<IPreference<?>> settingList = new ArrayList<>();

    @MainConstructor
    public Explorer(@NonNull Properties properties, @Nullable Drawable icon, @NonNull StateFragment fragment) {
        this.id = properties.id;
        this.label = properties.label;
        this.icon = icon;
        this.fragment = fragment;
        fragment.setOnPauseObserver(() -> {
            if (getStateObserver() != null)
                getStateObserver().onHide();
        });
        fragment.setOnResumeObserver(() -> {
            if (getStateObserver() != null)
                getStateObserver().onShow();
        });
    }

    @MainConstructor
    public Explorer(@NonNull Properties properties, @NonNull StateFragment fragment) {
        this(properties, null, fragment);
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
        return fragment;
    }

    @NonNull
    @Override
    public ArrayList<ExplorerMenu> getMenuList() {
        return menuList;
    }

    @NonNull
    @Override
    public ArrayList<IPreference<?>> getSettingList() {
        return settingList;
    }

}

