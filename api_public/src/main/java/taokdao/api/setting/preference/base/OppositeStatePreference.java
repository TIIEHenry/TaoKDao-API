package taokdao.api.setting.preference.base;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import taokdao.api.base.annotation.relation.MainConstructor;
import taokdao.api.data.bean.IProperties;
import taokdao.api.data.mmkv.IMMKV;

public abstract class OppositeStatePreference implements IOppositeStatePreference {

    private final String id;
    private final Drawable icon;
    private final String title;
    private final String description;
    private final IMMKV mmkv;
    private final Listener listener;
    private final boolean defaultValue;
    private IGroupPreference group;
    private boolean enable = true;
    private boolean idUseGroup = true;

    @MainConstructor
    public OppositeStatePreference(@NonNull IMMKV mmkv, boolean defaultValue, @NonNull IProperties properties, Drawable icon, Listener listener) {
        this.mmkv = mmkv;
        this.defaultValue = defaultValue;
        this.id = properties.id();
        this.title = properties.getLabel();
        this.description = properties.getDescription();
        this.icon = icon;
        this.listener = listener;

    }


    public OppositeStatePreference(@NonNull IMMKV mmkv, boolean defaultValue, @NonNull IProperties properties, Listener listener) {
        this(mmkv, defaultValue, properties, null, listener);
    }

    @Override
    public void saveValue(@NonNull Boolean value) {
        mmkv.encode(getIdWithGroup(), value);
    }

    @NonNull
    @Override
    public Boolean loadValue() {
        return mmkv.decodeBool(getIdWithGroup(), defaultValue);
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
    public void setGroup(IGroupPreference group) {
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
    public void on() {
        onToggle(true);
    }

    @Override
    public void off() {
        onToggle(false);
    }


    @Override
    public void onToggle(boolean isOn) {
        saveValue(isOn);
        if (listener != null)
            listener.onToggle(isOn);
    }

}
