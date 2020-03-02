package androcode.api.main.menu;

import androidx.annotation.Nullable;

import androcode.api.main.IMainActivity;
import androcode.api.editor.IEditor;

public interface MenuCallback {
    void onMenuAction(IMainActivity main,    @Nullable IEditor editor);
}