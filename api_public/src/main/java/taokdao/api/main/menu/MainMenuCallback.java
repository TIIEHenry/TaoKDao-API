package taokdao.api.main.menu;

import androidx.annotation.Nullable;

import taokdao.api.main.IMainContext;
import taokdao.api.ui.content.editor.IEditor;

public interface MainMenuCallback {
    void onMenuAction(IMainContext main, @Nullable IEditor<?, ?> editor);
}