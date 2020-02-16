package androcode.api.drawer;

import androcode.api.drawer.drawerstart.IExplorerFragment;

public interface IDrawerStart extends IDrawer {
    void addExplorerFragment(IExplorerFragment iExplorerFragment);

    boolean removeExplorerFragment(IExplorerFragment iExplorerFragment);

    void setCurrentExplorerFragment(IExplorerFragment iExplorerFragment);
}
