package androcode.api.main.content;

import android.graphics.drawable.Drawable;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;

import androcode.api.editor.IEditor;

public class TabContent {
    @Nullable
    public Drawable icon;
    @NonNull
    public String label;
    @NonNull
    public String path;
    @NonNull
    public View layout;
    @NonNull
    public IEditor editor;

    @NonNull
    public ITabContentLifecycle lifecycle=new TabContentBaseLifecycle();

    public TabContent(@NonNull String label, @NonNull String path, @NonNull View layout, @NonNull IEditor editor) {
        this.label = label;
        this.path = path;
        this.layout = layout;
        this.editor = editor;
    }
    public TabContent(@NonNull File file, @NonNull View layout, @NonNull IEditor editor) {
        this(file.getName(),file.getAbsolutePath(),layout,editor);
    }

}
