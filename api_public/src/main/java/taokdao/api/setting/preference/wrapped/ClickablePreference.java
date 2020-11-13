package taokdao.api.setting.preference.wrapped;

import android.graphics.drawable.Drawable;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import taokdao.api.base.annotation.relation.MainConstructor;
import taokdao.api.data.bean.IProperties;
import taokdao.api.setting.preference.IClickablePreference;
import taokdao.api.setting.preference.base.IGroupPreference;

public class ClickablePreference implements IClickablePreference {

    private final String id;
    private final Drawable icon;
    private final String title;
    private final String description;
    private final View.OnClickListener clickListener;
    private final View.OnLongClickListener longClickListener;
    private IGroupPreference group;
    private boolean enable = true;
    private boolean idUseGroup = true;

    @MainConstructor
    public ClickablePreference(@NonNull IProperties properties, Drawable icon, @Nullable View.OnClickListener clickListener, @Nullable View.OnLongClickListener longClickListener) {
        this.id = properties.id();
        this.title = properties.getLabel();
        this.description = properties.getDescription();
        this.icon = icon;
        this.clickListener = clickListener;
        this.longClickListener = longClickListener;
    }


    public ClickablePreference(@NonNull IProperties properties, @Nullable View.OnClickListener clickListener, @Nullable View.OnLongClickListener longClickListener) {
        this(properties, null, clickListener, longClickListener);
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
    public boolean isIdUseGroup() {
        return idUseGroup;
    }

    @Override
    public void setIdUseGroup(boolean idUseGroup) {
        this.idUseGroup = idUseGroup;
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

    @Override
    public void onClick(View v) {
        if (clickListener != null)
            clickListener.onClick(v);
    }

    @Override
    public boolean onLongClick(View v) {
        if (longClickListener != null)
            return longClickListener.onLongClick(v);
        return false;
    }
}
