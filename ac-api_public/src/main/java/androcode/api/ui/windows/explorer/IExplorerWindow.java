package androcode.api.ui.windows.explorer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androcode.api.ui.windows.IWindow;

public interface IExplorerWindow extends IWindow {
    void addExplorer(@NonNull IExplorer explorer);

    boolean removeExplorer(@NonNull IExplorer explorer);

    void showExplorer(@NonNull IExplorer explorer);

    @Nullable
    IExplorer getCurrentExplorer();
}
