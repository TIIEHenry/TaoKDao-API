package androcode.api.drawer;

import androcode.api.drawer.drawerbottom.ITabFragment;

public interface IDrawerBottom extends IDrawer {
    void addTabFragment(ITabFragment iTabFragment, Boolean select);

    void removeTabFragment(ITabFragment iTabFragment);

    void selectTabFragment(ITabFragment iTabFragment);

}
