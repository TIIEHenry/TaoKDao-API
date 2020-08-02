package taokdao.api.ui.window.tabtool;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import taokdao.api.ui.window.IWindow;

public interface ITabToolWindow extends IWindow<ITabToolWindow> {
    void init();

    void add(@NonNull ITabTool tabTool, boolean select);

    default void add(@NonNull ITabTool tabTool) {
        add(tabTool, true);
    }

    boolean remove(@NonNull ITabTool tabTool);

    void show(@NonNull ITabTool tabTool);

    @Nullable
    ITabTool get(@NonNull String id);

    @NonNull
    List<ITabTool> getList();

    @Nullable
    ITabTool getCurrent();

    void refreshMenu();
}
