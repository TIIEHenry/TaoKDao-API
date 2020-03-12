package androcode.api.ui.windows.tabtool;

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

import androcode.api.main.IMainActivity;
import androcode.api.setting.preference.base.IPreference;
import androcode.base.annotation.Identifier;
import androcode.base.annotation.relation.MultiConstructor;
import androcode.base.fragment.StateFragment;

public abstract class TabToolFragment extends StateFragment implements ITabTool {
    @Identifier
    private final int id;
    private final String label;
    private final Drawable icon;

    private ArrayList<TabToolMenu> menuList = new ArrayList<>();
    private ArrayList<IPreference<?>> settingList = new ArrayList<>();


    @LayoutRes
    private int layoutId;

    private View layout = null;

    @MultiConstructor
    public TabToolFragment(View layout, @Identifier int id, String label, Drawable icon) {
        this.id = id;
        this.label = label;
        this.icon = icon;
        setObservers();
        this.layout = layout;
    }

    public TabToolFragment(View layout, IMainActivity main, @Identifier int id, @StringRes int label, @DrawableRes int icon) {
        this(layout, id, main.getString(label), main.getDrawable(icon));
    }

    public TabToolFragment(View layout, IMainActivity main, @StringRes int label, @DrawableRes int icon) {
        this(layout, main, label, label, icon);
    }

    @MultiConstructor
    public TabToolFragment(@LayoutRes int layoutId, @Identifier int id, String label, Drawable icon) {
        this.id = id;
        this.label = label;
        this.icon = icon;
        this.layoutId = layoutId;
        setObservers();
    }

    public TabToolFragment(@LayoutRes int layoutId, IMainActivity main, @Identifier int id, @StringRes int label, @DrawableRes int icon) {
        this(layoutId, id, main.getString(label), main.getDrawable(icon));
    }

    public TabToolFragment(@LayoutRes int layoutId, IMainActivity main, @StringRes int label, @DrawableRes int icon) {
        this(layoutId, main, label, label, icon);
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
