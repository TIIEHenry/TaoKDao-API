package androcode.api.drawer;

import androcode.api.drawer.drawerstart.IDrawerLifecycle;

public interface IDrawer {
    void showDrawer();

    void hideDrawer();

    boolean isDrawerShown();

    void addLifecycleListener(IDrawerLifecycle listener);

    boolean removeLifecycleListener(IDrawerLifecycle listener);
}
