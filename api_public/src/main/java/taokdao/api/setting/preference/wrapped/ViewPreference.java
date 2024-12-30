package taokdao.api.setting.preference.wrapped;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import taokdao.api.base.annotation.relation.MainConstructor;
import taokdao.api.data.bean.IProperties;
import taokdao.api.setting.preference.IViewPreference;
import taokdao.api.setting.preference.base.IGroupPreference;

public abstract class ViewPreference implements IViewPreference {

    private final String id;
    private final Drawable icon;
    private final String title;
    private final String description;
    private IGroupPreference group;
    private boolean enable = true;

    @MainConstructor
    public ViewPreference(@NonNull IProperties properties, Drawable icon) {
        this.id = properties.id();
        this.title = properties.getLabel();
        this.description = properties.getDescription();
        this.icon = icon;
    }

    public ViewPreference(@NonNull IProperties properties) {
        this(properties, null);
    }


    @NonNull
    @Override
    public Object loadValue() {
        return new Object();
    }

    @NonNull
    @Override
    public String getTitle() {
        return title;
    }

    @Nullable
    @Override
    public Drawable getIcon() {
        return icon;
    }

    @Nullable
    @Override
    public String getDescription() {
        return description;
    }

    @Nullable
    @Override
    public IGroupPreference getGroup() {
        return group;
    }

    @Override
    public void setGroup(@NonNull IGroupPreference group) {
        this.group = group;
    }

    @Override
    public void enable() {
        enable = true;
    }

    @Override
    public void disable() {
        enable = false;
    }

    @Override
    public boolean isEnabled() {
        return enable;
    }

    @NonNull
    @Override
    public String id() {
        return id;
    }

}
