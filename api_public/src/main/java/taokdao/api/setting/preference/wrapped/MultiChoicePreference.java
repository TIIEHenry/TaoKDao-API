package taokdao.api.setting.preference.wrapped;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.tencent.mmkv.MMKV;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import taokdao.api.data.bean.Properties;
import taokdao.api.setting.preference.IMultiChoicePreference;
import taokdao.api.setting.preference.base.IGroupPreference;
import taokdao.api.base.annotation.relation.MainConstructor;

public class MultiChoicePreference implements IMultiChoicePreference {

    private final String id;
    private final Drawable icon;
    private final String title;
    private final String description;
    private final MMKV mmkv;
    private final Listener listener;
    private final Set<String> defaultValue;
    private IGroupPreference group;
    private boolean enable = true;
    private String[] items;
    private boolean idUseGroup = true;

    @MainConstructor
    public MultiChoicePreference(@NonNull MMKV mmkv, Set<String> defaultValue, @NonNull Properties properties, Drawable icon, Listener listener) {
        this.mmkv = mmkv;
        this.defaultValue = defaultValue;
        this.id = properties.id;
        this.title = properties.label;
        this.description = properties.des;
        this.icon = icon;
        this.listener = listener;
    }


    public MultiChoicePreference(@NonNull MMKV mmkv, Set<String> defaultValue, @NonNull Properties properties, Listener listener) {
        this(mmkv, defaultValue, properties, null, listener);
    }

    @NonNull
    @Override
    public Set<String> loadValue() {
        return mmkv.getStringSet(getIdWithGroup(), defaultValue);
    }

    @Override
    public void saveValue(Set<String> value) {
        mmkv.edit().putStringSet(getIdWithGroup(), value).apply();
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