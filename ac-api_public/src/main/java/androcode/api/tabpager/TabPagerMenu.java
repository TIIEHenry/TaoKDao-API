package androcode.api.tabpager;

import android.graphics.drawable.Drawable;


public class TabPagerMenu {
    public Drawable icon;
    public String label;
    public Runnable click;
    public Runnable longClick;
    public boolean showIcon = true;
    public boolean showLabel = true;

    public TabPagerMenu(Drawable icon, String label, Runnable click, Runnable longClick) {
        this.icon = icon;
        this.label = label;
        this.click = click;
        this.longClick = longClick;
    }

    public TabPagerMenu(Drawable icon, String label, Runnable click) {
        this(icon, label, click, null);
    }

    public TabPagerMenu(Drawable icon, Runnable click) {
        this(icon, null, click, null);
    }

    public TabPagerMenu(String label, Runnable click) {
        this(null, label, click, null);
    }
}
