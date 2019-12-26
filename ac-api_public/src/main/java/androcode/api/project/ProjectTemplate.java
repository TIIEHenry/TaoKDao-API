package androcode.api.project;

import android.graphics.drawable.Drawable;

import java.io.File;

public class ProjectTemplate {
    public Drawable icon;
    public String label;
    public String description;
    public Callback click;
    public Callback longClick;

    public ProjectTemplate(Drawable icon, String label, String description, Callback click) {
        this.icon = icon;
        this.label = label;
        this.description = description;
        this.click = click;
    }

    public ProjectTemplate(String label, String description, Callback click) {
        this.label = label;
        this.description = description;
        this.click = click;
    }

    public interface Callback {
        void onAction(File dir);
    }
}
