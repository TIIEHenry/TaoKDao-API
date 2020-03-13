package androcode.api.ui.windows.tabtool;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import androcode.api.ui.windows.IWindow;

public interface ITabToolWindow extends IWindow {
    void addTabTool(@NonNull ITabTool tabTool, boolean select);

    void removeTabTool(@NonNull ITabTool tabTool);

    void showTabTool(@NonNull ITabTool tabTool);

    @Nullable
    ITabTool getTabTool(@NonNull String id);

    @NonNull
    List<ITabTool> getTabToolList();

    @Nullable
    ITabTool getCurrentTabTool();
}
