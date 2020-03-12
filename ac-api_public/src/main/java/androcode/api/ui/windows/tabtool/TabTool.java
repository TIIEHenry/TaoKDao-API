package androcode.api.ui.windows.tabtool;


import android.graphics.drawable.Drawable;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;

import java.util.ArrayList;

import androcode.api.main.IMainActivity;
import androcode.api.setting.preference.base.IPreference;
import androcode.base.annotation.Identifier;
import androcode.base.annotation.relation.MainConstructor;
import androcode.base.fragment.StateFragment;

public class TabTool implements ITabTool {
    @Identifier
    private final int id;
    private final String label;
    private final Drawable icon;
    private final StateFragment fragment;
    private ArrayList<TabToolMenu> menuList = new ArrayList<>();
    private ArrayList<IPreference<?>> settingList = new ArrayList<>();

    @MainConstructor
    public TabTool(@Identifier int id, String label, Drawable icon, StateFragment fragment) {
        this.id = id;
        this.label = label;
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

    public TabTool(IMainActivity main, @Identifier @StringRes int label, @DrawableRes int icon, StateFragment fragment) {
        this(label, main.getString(label), main.getDrawable(icon), fragment);
    }

    @Identifier
    @Override
    public int id() {
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
    public ArrayList<TabToolMenu> getMenuList() {
        return menuList;
    }

    @NonNull
    @Override
    public ArrayList<IPreference<?>> getSettingList() {
        return settingList;
    }

}
