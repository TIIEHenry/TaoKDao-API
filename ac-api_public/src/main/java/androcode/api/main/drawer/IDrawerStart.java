package androcode.api.main.drawer;

import androcode.api.main.drawerstart.IExplorerFragment;

public interface IDrawerStart extends IDrawer {
    void addExplorerFragment(IExplorerFragment iExplorerFragment);

    boolean removeExplorerFragment(IExplorerFragment iExplorerFragment);

    void showExplorerFragment(IExplorerFragment iExplorerFragment);
}
