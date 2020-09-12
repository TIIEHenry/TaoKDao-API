package taokdao.api.ui.toolpage;

import androidx.annotation.NonNull;

import taokdao.api.ui.toolpage.internal.IInternalToolPageManager;
import taokdao.api.ui.window.ITabWindow;

public interface IToolPageWindow extends ITabWindow<IToolPageWindow, IToolPage> {

    @NonNull
    IInternalToolPageManager getInternalToolGroupManager();

    void refreshMenu();
}
