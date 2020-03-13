package androcode.api.ui.content.wrapped;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;
import java.util.ArrayList;

import androcode.api.bean.Properties;
import androcode.api.setting.preference.base.IPreference;
import androcode.api.ui.content.ITabContent;
import androcode.api.ui.content.editor.IEditor;
import androcode.api.ui.content.menu.TabContentMenu;
import androcode.base.annotation.relation.MainConstructor;
import androcode.base.fragment.StateFragment;

public abstract class TabContentFragment extends StateFragment implements ITabContent {
    @Nullable
    public Drawable icon;
    @NonNull
    public String id;
    @NonNull
    public String label;
    @NonNull
    public String path;
    @NonNull
    public IEditor editor;
    private View layout;

    private ArrayList<IPreference<?>> settingList = new ArrayList<>();
    private ArrayList<TabContentMenu> menuList = new ArrayList<>();

    @MainConstructor
    public TabContentFragment(@NonNull Properties properties, @Nullable Drawable icon, @NonNull String path, View layout, @NonNull IEditor editor) {
        this.id = properties.id;
        this.label = properties.label;
        this.icon = icon;
        this.path = path;
        this.editor = editor;
        this.layout = layout;
        setObservers();
    }

    public TabContentFragment(@NonNull Properties properties, @NonNull String path, View layout, @NonNull IEditor editor) {
        this(properties, null, path, layout, editor);
    }

    public TabContentFragment(@NonNull Properties properties, @Nullable Drawable icon, @NonNull File file, View layout, @NonNull IEditor editor) {
        this(properties, icon, file.getAbsolutePath(), layout, editor);
        this.label = file.getName();
    }

    public TabContentFragment(@NonNull Properties properties, @NonNull File file, View layout, @NonNull IEditor editor) {
        this(properties, null, file.getAbsolutePath(), layout, editor);
        this.label = file.getName();
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
    protected View getView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container) {
        return layout;
    }

    @NonNull
    @Override
    public String id() {
        return id;
    }

    @Nullable
    @Override
    public Drawable getIcon() {
        return icon;
    }

    @NonNull
    @Override
    public String getLabel() {
        return label;
    }

    @NonNull
    @Override
    public String getPath() {
        return path;
    }

    @NonNull
    @Override
    public StateFragment getFragment() {
        return this;
    }

    @NonNull
    @Override
    public IEditor getEditor() {
        return editor;
    }

    @NonNull
    @Override
    public ArrayList<TabContentMenu> getMenuList() {
        return menuList;
    }

    @NonNull
    @Override
    public ArrayList<IPreference<?>> getSettingList() {
        return settingList;
    }
}
