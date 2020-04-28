package taokdao.api.template.wrapped;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;

import taokdao.api.data.bean.Properties;
import taokdao.api.template.ITemplate;

public class Template implements ITemplate  {
    @NonNull
    private String id;
    private Drawable icon;
    private String label;
    private String description;
    private Callback onCreateTemplate;
    private Callback onShowTemplateInfo;

    public Template(@NonNull Properties properties, Drawable icon, Callback onCreateTemplate, Callback onShowTemplateInfo) {
        this.id = properties.id;
        this.label = properties.label;
        this.description = properties.des;
        this.icon = icon;
        this.onCreateTemplate = onCreateTemplate;
        this.onShowTemplateInfo = onShowTemplateInfo;
    }

    public Template(@NonNull Properties properties, Callback onCreateTemplate, Callback onShowTemplateInfo) {
        this(properties, null, onCreateTemplate, onShowTemplateInfo);
    }


    public Template(@NonNull Properties properties, Callback onCreateTemplate) {
        this(properties, null, onCreateTemplate, null);
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
