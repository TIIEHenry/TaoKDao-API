package androcode.api.project;

import android.graphics.drawable.Drawable;

import java.io.File;

public class ProjectTemplate {
    public Drawable icon;
    public String label;
    public String description;
    public Callback onCreateTemplate;
    public Callback onShowDescribtion;

    public ProjectTemplate(Drawable icon, String label, String description, Callback onCreateTemplate) {
        this.icon = icon;
        this.label = label;
        this.description = description;
        this.onCreateTemplate = onCreateTemplate;
    }

    public ProjectTemplate(String label, String description, Callback onCreateTemplate) {
        this.label = label;
        this.description = description;
        this.onCreateTemplate = onCreateTemplate;
    }

    public interface Callback {
        void onAction(File dir);
    }
}
