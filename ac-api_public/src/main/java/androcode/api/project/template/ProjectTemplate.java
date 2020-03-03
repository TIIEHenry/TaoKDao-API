package androcode.api.project.template;

import android.graphics.drawable.Drawable;

import java.io.File;

public class ProjectTemplate {
    public Drawable icon;
    public String label;
    public String description;
    public Callback onCreateTemplate;
    public Callback onShowTemplateInfo;

    public ProjectTemplate(Drawable icon, String label, String description, Callback onCreateTemplate,Callback onShowTemplateInfo) {
        this.icon = icon;
        this.label = label;
        this.description = description;
        this.onCreateTemplate = onCreateTemplate;
        this.onShowTemplateInfo = onShowTemplateInfo;
    }
    public ProjectTemplate(Drawable icon, String label, String description, Callback onCreateTemplate) {
        this(icon,label,description,onCreateTemplate,null);
    }

    public ProjectTemplate(String label, String description, Callback onCreateTemplate) {
        this(null,label,description,onCreateTemplate,null);
    }

    public interface Callback {
        void onAction(File dir);
    }
}
