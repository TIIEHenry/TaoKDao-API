package androcode.api.main.drawerstart;

import android.graphics.drawable.Drawable;

import androidx.fragment.app.Fragment;

import java.util.List;

public interface IExplorerFragment extends IDrawerLifecycle{
    String getTitle();

    String getDropDownTitle();

    Drawable getIcon();

    Drawable getDropDownIcon();

    Fragment getFragment();

    List<ExplorerFragmentMenu> getMenuList();

}
