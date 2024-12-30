package taokdao.api.setting.preference.wrapped;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import taokdao.api.base.annotation.relation.MainConstructor;
import taokdao.api.data.bean.IProperties;
import taokdao.api.data.mmkv.IMMKV;
import taokdao.api.setting.preference.IMultiChoicePreference;
import taokdao.api.setting.preference.base.IGroupPreference;

public class MultiChoicePreference implements IMultiChoicePreference {

    private final String id;
    private final Drawable icon;
    private final String title;
    private final String description;
    private final IMMKV mmkv;
    private final Listener listener;
    private final Set<String> defaultValue;
    private IGroupPreference group;
    private boolean enable = true;
    private String[] items;
    private boolean idUseGroup = true;

    @MainConstructor
    public MultiChoicePreference(@NonNull IMMKV mmkv, Set<String> defaultValue, @NonNull IProperties properties, Drawable icon, Listener listener) {
        this.mmkv = mmkv;
        this.defaultValue = defaultValue;
        this.id = properties.id();
        this.title = properties.getLabel();
        this.description = properties.getDescription();
        this.icon = icon;
        this.listener = listener;
    }


    public MultiChoicePreference(@NonNull IMMKV mmkv, Set<String> defaultValue, @NonNull IProperties properties, Listener listener) {
        this(mmkv, defaultValue, properties, null, listener);
    }

    @NonNull
    @Override
    public Set<String> loadValue() {
        return mmkv.decodeStringSet(getIdWithGroup(), defaultValue);
    }

    @Override
    public void saveValue(Set<String> value) {
        mmkv.encode(getIdWithGroup(), value);
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

    @NonNull
    @Override
    public String[] getItemList() {
        return items;
    }

    @Override
    public void setItemList(@NonNull String[] items) {
        this.items = items;
    }

    @Override
    public void onChosen(Map<Integer, String> result) {
        saveValue(new HashSet<>(result.values()));
        if (listener != null)
            listener.onChosen(result);
    }


}