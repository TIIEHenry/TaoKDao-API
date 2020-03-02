package androcode.api.main.drawerbottom;

import android.graphics.drawable.Drawable;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public interface ITabFragment {
    int id();

    String getLabel();

    Drawable getIcon();

    Fragment getFragment();

    ArrayList<TabFragmentMenu> getStartMenuList();

    ArrayList<TabFragmentMenu> getEndMenuList();

}
