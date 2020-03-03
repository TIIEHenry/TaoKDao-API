package androcode.api.main.drawerbottom;

import android.graphics.drawable.Drawable;


public class TabToolMenu {
    public Drawable icon;
    public String label;
    public Runnable click;
    public Runnable longClick;
    public boolean showIcon = false;
    public boolean showLabel = false;

    public TabToolMenu(Drawable icon, String label, Runnable click, Runnable longClick) {
        this.icon = icon;
        if (icon != null)
            showIcon = true;
        this.label = label;
        if (label != null)
            showLabel = true;
        this.click = click;
        this.longClick = longClick;
    }

    public TabToolMenu(Drawable icon, String label, Runnable click) {
        this(icon, label, click, null);
    }

    public TabToolMenu(Drawable icon, Runnable click) {
        this(icon, null, click, null);
    }

    public TabToolMenu(String label, Runnable click) {
        this(null, label, click, null);
    }
}
