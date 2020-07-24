package taokdao.api.ui.window.tabtool;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import taokdao.api.ui.window.IWindow;

public interface ITabToolWindow extends IWindow {
    void init();

    void add(@NonNull ITabTool tabTool, boolean select);

    void remove(@NonNull ITabTool tabTool);

    void show(@NonNull ITabTool tabTool);

    @Nullable
    ITabTool get(@NonNull String id);

    @NonNull
    List<ITabTool> getList();

    @Nullable
    ITabTool getCurrent();

    void refreshMenu();
}
