package androcode.api.drawer.drawerstart;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseExplorerFragment extends Fragment implements IExplorerFragment {

    public BaseExplorerFragment(){
        super();
    }
    public BaseExplorerFragment(int layoutID){
        super(layoutID);
    }
    private ArrayList<ExplorerFragmentMenu> menus = new ArrayList<>();

    @Override
    public Fragment getFragment() {
        return this;
    }

    @Override
    public List<ExplorerFragmentMenu> getMenuList() {
        return menus;
    }

    public void removeSelf() {
//        Drawers.START.removeExplorerFragment(this);
    }
}

