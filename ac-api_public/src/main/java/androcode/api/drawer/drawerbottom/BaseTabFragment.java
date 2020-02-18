package androcode.api.drawer.drawerbottom;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import androcode.api.activity.IMainActivity;
import androcode.api.drawer.drawerbottom.ITabFragment;
import androcode.api.drawer.drawerbottom.TabFragmentMenu;

public abstract class BaseTabFragment extends Fragment implements ITabFragment {
    private final IMainActivity main;
    private ArrayList<TabFragmentMenu> startMenus = new ArrayList<>();
    private ArrayList<TabFragmentMenu> endMenus = new ArrayList<>();

    public BaseTabFragment(IMainActivity main) {
        this.main = main;
    }

    public ITabFragment addDefaultMenu() {
        startMenus.add(new TabFragmentMenu(getIcon(), getTitle(), () -> {

        }));
        return this;
    }

    @Override
    public Fragment getFragment() {
        return this;
    }

    @Override
    public ArrayList<TabFragmentMenu> getStartMenuList() {
        return startMenus;
    }

    @Override
    public ArrayList<TabFragmentMenu> getEndMenuList() {
        return endMenus;
    }

    public void removeSelf() {
        main.getDrawerBottom().removeTabFragment(this);
    }
}
