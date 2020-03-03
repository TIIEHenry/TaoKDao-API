package androcode.api.main.drawerbottom;

import android.graphics.drawable.Drawable;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import androcode.api.main.IMainActivity;

public abstract class BaseTabTool extends Fragment implements ITabTool {
    private final IMainActivity main;
    private final int id;
    private final String label;
    private final Drawable icon;
    private ArrayList<TabToolMenu> startMenus = new ArrayList<>();
    private ArrayList<TabToolMenu> endMenus = new ArrayList<>();

    public BaseTabTool(IMainActivity main, int id, String label, Drawable icon) {
        this.id = id;
        this.main = main;
        this.label = label;
        this.icon = icon;
    }

    public BaseTabTool(IMainActivity main, @StringRes int label, @DrawableRes int icon) {
        this.id = label;
        this.main = main;
        this.label = main.getString(label);
        this.icon = main.getDrawable(icon);
    }

    public ITabTool addDefaultMenu() {
        startMenus.add(new TabToolMenu(getIcon(), getLabel(), () -> {

        }));
        return this;
    }

    @Override
    public int id() {
        return id;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public Drawable getIcon() {
        return icon;
    }

    @Override
    public Fragment getFragment() {
        return this;
    }

    @Override
    public ArrayList<TabToolMenu> getStartMenuList() {
        return startMenus;
    }

    @Override
    public ArrayList<TabToolMenu> getEndMenuList() {
        return endMenus;
    }

    public void removeSelf() {
        main.getDrawerBottom().removeTabFragment(this);
    }
}
