package androcode.api.tabwin;

import android.graphics.drawable.Drawable;
import android.view.View;

import java.io.File;

import androcode.api.editor.IEditor;

public class TabWin {
    public Drawable icon;
    public Drawable formatIcon;
    public String label;
    public String path;
    public IEditor editor;
    public View layout;

    public TabWin(String label, String path, IEditor editor) {
        this.label = label;
        this.path = path;
        if (editor != null) {
            this.editor = editor;
            layout = editor.getView();
        }
    }

    public TabWin(File file, IEditor editor) {
        this(file.getName(), file.getAbsolutePath(), editor);
    }

    public TabWin(File file) {
        this(file.getName(), file.getAbsolutePath(), null);
    }
}
