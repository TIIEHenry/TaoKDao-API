package androcode.api.ui.windows.explorer;

import android.graphics.drawable.Drawable;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;

import java.util.ArrayList;

import androcode.api.main.IMainActivity;
import androcode.api.setting.preference.base.IPreference;
import androcode.base.annotation.Identifier;
import androcode.base.annotation.relation.MainConstructor;
import androcode.base.fragment.StateFragment;

public class Explorer implements IExplorer {
    private final String id;
    private final String label;
    private final Drawable icon;
    private final StateFragment fragment;
    private ArrayList<ExplorerMenu> menuList = new ArrayList<>();
    private ArrayList<IPreference<?>> settingList = new ArrayList<>();

    @MainConstructor
    public Explorer(@NonNull String id, @NonNull String label, @Nullable Drawable icon, @NonNull StateFragment fragment) {
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

    public Explorer(@NonNull String id, IMainActivity main, @Identifier @StringRes int label, @DrawableRes int icon, StateFragment fragment) {
        this(id, main.getString(label), main.getDrawable(icon), fragment);
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
    public String getDropDownLabel() {
        return label;
    }

    @Override
    public Drawable getIcon() {
        return icon;
    }

    @Nullable
    @Override
    public Drawable getDropDownIcon() {
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

