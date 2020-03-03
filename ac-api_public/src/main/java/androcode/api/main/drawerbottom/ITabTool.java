package androcode.api.main.drawerbottom;

import android.graphics.drawable.Drawable;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public interface ITabTool {
    int id();

    String getLabel();

    Drawable getIcon();

    Fragment getFragment();

    ArrayList<TabToolMenu> getStartMenuList();

    ArrayList<TabToolMenu> getEndMenuList();

}
