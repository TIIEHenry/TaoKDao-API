package taokdao.api.ui.content.wrapped;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import taokdao.api.data.bean.IProperties;
import taokdao.api.setting.preference.base.IPreference;
import taokdao.api.ui.content.IContent;
import taokdao.api.ui.content.editor.IEditor;
import taokdao.api.ui.content.menu.ControlMenu;
import taokdao.api.ui.content.menu.QuickMenu;
import taokdao.api.base.annotation.relation.MainConstructor;
import taokdao.api.base.fragment.StateFragment;

public abstract class ContentFragment extends StateFragment implements IContent {
    @Nullable
    public Drawable icon;
    @NonNull
    public String id;
    @NonNull
    public String label;
    @NonNull
    public String path;
    @NonNull
    public IEditor<?, ?> editor;
    String openerId = "";
    private View layout;
    private ArrayList<IPreference<?>> settingList = new ArrayList<>();
    private ArrayList<ControlMenu> controlMenuList = new ArrayList<>();
    private ArrayList<QuickMenu> quickMenuList = new ArrayList<>();

    @MainConstructor
    public ContentFragment(@NonNull IProperties properties, @Nullable Drawable icon, @NonNull String path, View layout, @NonNull IEditor<?, ?> editor) {
        this.id = properties.id();
        this.label = properties.getLabel();
        this.icon = icon;
        this.path = path;
        this.editor = editor;
        this.layout = layout;
        setObservers();
    }

    public ContentFragment(@NonNull IProperties properties, @NonNull String path, View layout, @NonNull IEditor<?, ?> editor) {
        this(properties, null, path, layout, editor);
    }

    public ContentFragment(@NonNull IProperties properties, @Nullable Drawable icon, @NonNull File file, View layout, @NonNull IEditor<?, ?> editor) {
        this(properties, icon, file.getAbsolutePath(), layout, editor);
        this.label = file.getName();
    }


    public ContentFragment(@NonNull IProperties properties, @NonNull File file, View layout, @NonNull IEditor<?, ?> editor) {
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
    public IEditor<?, ?> getEditor() {
        return editor;
    }

    @NonNull
    @Override
    public ArrayList<ControlMenu> getControlMenuList() {
        return controlMenuList;
    }

    @NonNull
    @Override
    public List<QuickMenu> getQuickMenuList() {
        return quickMenuList;
    }

    @NonNull
    @Override
    public ArrayList<IPreference<?>> getSettingList() {
        return settingList;
    }

    @NonNull
    @Override
    public String getOpener() {
        return openerId;
    }

    @Override
    public void setOpener(@NonNull String openerId) {
        this.openerId = openerId;
    }
}
