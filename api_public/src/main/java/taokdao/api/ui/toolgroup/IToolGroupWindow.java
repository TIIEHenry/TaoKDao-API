package taokdao.api.ui.toolgroup;

import androidx.annotation.NonNull;

import taokdao.api.ui.toolgroup.internal.IInternalToolGroupManager;
import taokdao.api.ui.window.ITabWindow;

public interface IToolGroupWindow extends ITabWindow<IToolGroupWindow, IToolGroup> {

    @NonNull
    IInternalToolGroupManager getInternalToolGroupManager();

    void refreshMenu();
}
