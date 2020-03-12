package androcode.api.project.template;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;

public class ProjectTemplate implements IProjectTemplate {
    @NonNull
    public String id;
    public Drawable icon;
    public String label;
    public String description;
    public Callback onCreateTemplate;
    public Callback onShowTemplateInfo;

    public ProjectTemplate(@NonNull String id, Drawable icon, String label, String description, Callback onCreateTemplate, Callback onShowTemplateInfo) {
        this.id = id;
        this.icon = icon;
        this.label = label;
        this.description = description;
        this.onCreateTemplate = onCreateTemplate;
        this.onShowTemplateInfo = onShowTemplateInfo;
    }

    public ProjectTemplate(@NonNull String id, Drawable icon, String label, String description, Callback onCreateTemplate) {
        this(id, icon, label, description, onCreateTemplate, null);
    }

    public ProjectTemplate(@NonNull String id, String label, String description, Callback onCreateTemplate) {
        this(id, null, label, description, onCreateTemplate, null);
    }

    @Nullable
    @Override
    public Drawable getIcon() {
        return icon;
    }

    @NonNull
    @Override
    public String getLabel() {
        return label;
    }

    @NonNull
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void onCreateTemplate(File dir) {
        if (onCreateTemplate != null) {
            onCreateTemplate.onAction(dir);
        }
    }

    @Override
    public void onShowTemplateInfo() {
        if (onShowTemplateInfo != null) {
            onShowTemplateInfo.onAction(null);
        }
    }

    @NonNull
    @Override
    public String id() {
        return id;
    }

    public interface Callback {
        void onAction(File dir);
    }
}
