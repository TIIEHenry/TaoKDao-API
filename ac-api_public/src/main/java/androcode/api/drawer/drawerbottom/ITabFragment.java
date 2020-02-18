package androcode.api.drawer.drawerbottom;

import android.graphics.drawable.Drawable;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public interface ITabFragment {
    String getTitle();

    Drawable getIcon();

    Fragment getFragment();

    ArrayList<TabFragmentMenu> getStartMenuList();

    ArrayList<TabFragmentMenu> getEndMenuList();

}
