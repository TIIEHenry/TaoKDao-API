package androcode.api.ui.windows.explorer;

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
import androcode.base.annotation.relation.MultiConstructor;
import androcode.base.fragment.StateFragment;


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
    public ExplorerFragment(@NonNull String id, @NonNull View layout, @NonNull String label, @Nullable Drawable icon) {
        this.id = id;
        this.label = label;
        this.icon = icon;
        this.layout = layout;
        setObservers();
    }

    public ExplorerFragment(@NonNull String id, View layout, IMainActivity main, @StringRes int label, @DrawableRes int icon) {
        this(id, layout, main.getString(label), main.getDrawable(icon));
    }

    @MultiConstructor
    public ExplorerFragment(@NonNull String id, int layoutId, String label, Drawable icon) {
        this.id = id;
        this.label = label;
        this.icon = icon;
        this.layoutId = layoutId;
        setObservers();
    }

    public ExplorerFragment(@NonNull String id, @LayoutRes int layoutId, IMainActivity main, @StringRes int label, @DrawableRes int icon) {
        this(id, layoutId, main.getString(label), main.getDrawable(icon));
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
