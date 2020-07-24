package taokdao.api.ui.window.explorer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import taokdao.api.ui.window.IWindow;

public interface IExplorerWindow extends IWindow {
    void add(@NonNull IExplorer explorer);

    boolean remove(@NonNull IExplorer explorer);

    void show(@NonNull IExplorer explorer);

    @Nullable
    IExplorer getCurrent();

}
