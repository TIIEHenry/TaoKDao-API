package androcode.api.main.drawer;

import androidx.annotation.Nullable;

import androcode.api.main.drawerbottom.ITabFragment;

public interface IDrawerBottom extends IDrawer {
    void addTabFragment(ITabFragment iTabFragment, Boolean select);

    void removeTabFragment(ITabFragment iTabFragment);

    void selectTabFragment(ITabFragment iTabFragment);

    @Nullable
    ITabFragment getTabFragment( int id);

}
