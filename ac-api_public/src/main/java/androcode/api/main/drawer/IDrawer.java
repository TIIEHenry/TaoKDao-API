package androcode.api.main.drawer;

import androcode.api.main.drawerstart.IDrawerLifecycle;

public interface IDrawer {
    void showDrawer();

    void hideDrawer();

    boolean isDrawerShown();

    void addLifecycleListener(IDrawerLifecycle listener);

    boolean removeLifecycleListener(IDrawerLifecycle listener);
}
