package androcode.api.drawer.drawerbottom;

import android.graphics.drawable.Drawable;


public class TabFragmentMenu {
    public Drawable icon;
    public String label;
    public Runnable click;
    public Runnable longClick;
    public boolean showIcon = true;
    public boolean showLabel = true;

    public TabFragmentMenu(Drawable icon, String label, Runnable click, Runnable longClick) {
        this.icon = icon;
        this.label = label;
        this.click = click;
        this.longClick = longClick;
    }

    public TabFragmentMenu(Drawable icon, String label, Runnable click) {
        this(icon, label, click, null);
    }

    public TabFragmentMenu(Drawable icon, Runnable click) {
        this(icon, null, click, null);
    }

    public TabFragmentMenu(String label, Runnable click) {
        this(null, label, click, null);
    }
}
