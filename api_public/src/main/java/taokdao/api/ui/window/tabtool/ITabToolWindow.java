package taokdao.api.ui.window.tabtool;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import taokdao.api.ui.window.ITabWindow;
import taokdao.api.ui.window.IWindow;

public interface ITabToolWindow extends ITabWindow<ITabToolWindow,ITabTool> {

    void refreshMenu();
}
