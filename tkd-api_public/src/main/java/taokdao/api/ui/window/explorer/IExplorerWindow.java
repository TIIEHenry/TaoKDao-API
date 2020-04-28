package taokdao.api.ui.window.explorer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import taokdao.api.ui.window.IWindow;

public interface IExplorerWindow extends IWindow {
    void addExplorer(@NonNull IExplorer explorer);

    boolean removeExplorer(@NonNull IExplorer explorer);

    void showExplorer(@NonNull IExplorer explorer);

    @Nullable
    IExplorer getCurrentExplorer();
}
