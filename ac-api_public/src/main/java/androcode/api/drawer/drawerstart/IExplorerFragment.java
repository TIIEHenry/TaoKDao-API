package androcode.api.drawer.drawerstart;

import android.graphics.drawable.Drawable;

import androidx.fragment.app.Fragment;

import java.util.List;

import androcode.api.drawer.drawerstart.ExplorerFragmentMenu;

public interface IExplorerFragment extends IDrawerLifecycle{
    String getTitle();

    String getDropDownTitle();

    Drawable getIcon();

    Drawable getDropDownIcon();

    Fragment getFragment();

    List<ExplorerFragmentMenu> getMenuList();

}
