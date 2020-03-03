package androcode.api.main.drawer;

import androidx.annotation.Nullable;

import androcode.api.main.drawerbottom.ITabTool;

public interface IDrawerBottom extends IDrawer {
    void addTabFragment(ITabTool iTabTool, Boolean select);

    void removeTabFragment(ITabTool iTabTool);

    void selectTabFragment(ITabTool iTabTool);

    @Nullable
    ITabTool getTabFragment(int id);

}
