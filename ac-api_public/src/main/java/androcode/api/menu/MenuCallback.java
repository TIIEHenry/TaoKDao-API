package androcode.api.menu;

import androidx.annotation.Nullable;

import androcode.api.activity.IMainActivity;
import androcode.api.editor.IEditor;

public interface MenuCallback {
    void onMenuAction(IMainActivity main,    @Nullable IEditor editor);
}