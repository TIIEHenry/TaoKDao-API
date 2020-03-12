package androcode.api.ui.content;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;
import java.util.ArrayList;

import androcode.api.setting.preference.base.IPreference;
import androcode.api.ui.content.editor.IEditor;
import androcode.base.annotation.relation.MainConstructor;
import androcode.base.annotation.maintain.LongTerm;
import androcode.base.fragment.StateFragment;

@LongTerm
public class TabContent implements ITabContent {
    @NonNull
    public String id;
    @Nullable
    public Drawable icon;
    @NonNull
    public String label;
    @NonNull
    public String path;
    @NonNull
    public StateFragment fragment;
    @NonNull
    public IEditor editor;
    private ArrayList<IPreference<?>> settingList = new ArrayList<>();
    private ArrayList<TabContentMenu> menuList = new ArrayList<>();


//    @NonNull
//    public ITabContentLifecycle lifecycle = new TabContentBaseLifecycle();

    @MainConstructor
    public TabContent(@NonNull String id, @Nullable Drawable icon, @NonNull String label, @NonNull String path, @NonNull StateFragment fragment, @NonNull IEditor editor) {
        this.id = id;
        this.icon = icon;
        this.label = label;
        this.path = path;
        this.fragment = fragment;
        this.editor = editor;
        fragment.setOnPauseObserver(() -> {
            if (getStateObserver() != null)
                getStateObserver().onHide();
        });
        fragment.setOnResumeObserver(() -> {
            if (getStateObserver() != null)
                getStateObserver().onShow();
        });
    }

    public TabContent(@NonNull String id, @NonNull String label, @NonNull String path, @NonNull StateFragment fragment, @NonNull IEditor editor) {
        this(id, null, label, path, fragment, editor);
    }

    public TabContent(@NonNull String id, @Nullable Drawable icon, @NonNull File file, @NonNull StateFragment fragment, @NonNull IEditor editor) {
        this(id, icon, file.getName(), file.getAbsolutePath(), fragment, editor);
    }

    public TabContent(@NonNull String id, @NonNull File file, @NonNull StateFragment fragment, @NonNull IEditor editor) {
        this(id, null, file.getName(), file.getAbsolutePath(), fragment, editor);
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
        return fragment;
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
