package taokdao.api.main.menu;

import androidx.annotation.Nullable;

import taokdao.api.main.IMainActivity;
import taokdao.api.ui.content.editor.IEditor;

public interface MainMenuCallback {
    void onMenuAction(IMainActivity main, @Nullable IEditor<?, ?> editor);
}