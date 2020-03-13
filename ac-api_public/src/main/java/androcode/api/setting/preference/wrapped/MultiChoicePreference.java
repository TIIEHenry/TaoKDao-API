package androcode.api.setting.preference.wrapped;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import androcode.api.setting.preference.IMultiChoicePreference;
import androcode.api.setting.preference.base.IGroupPreference;
import androcode.api.bean.Properties;
import androcode.base.annotation.relation.MainConstructor;

public class MultiChoicePreference implements IMultiChoicePreference {

    private final String id;
    private final Drawable icon;
    private final String title;
    private final String description;
    private final SharedPreferences sharedPreferences;
    private final Listener listener;
    private final Set<String> defaultValue;
    private IGroupPreference group;
    private boolean enable = true;
    private String[] items;

    @MainConstructor
    public MultiChoicePreference(@NonNull SharedPreferences sharedPreferences, Set<String> defaultValue, @NonNull Properties properties, Drawable icon, Listener listener) {
        this.sharedPreferences = sharedPreferences;
        this.defaultValue = defaultValue;
        this.id = properties.id;
        this.title = properties.label;
        this.description = properties.des;
        this.icon=icon;
        this.listener = listener;
    }

    public MultiChoicePreference(@NonNull SharedPreferences sharedPreferences, Set<String> defaultValue, @NonNull Properties properties, Listener listener) {
        this(sharedPreferences, defaultValue, properties, null,  listener);
    }



    @NonNull
    @Override
    public Set<String> loadValue() {
        return sharedPreferences.getStringSet(getIdWithGroup(), defaultValue);
    }

    @Override
    public void saveValue(Set<String> value) {
        sharedPreferences.edit().putStringSet(getIdWithGroup(), value).apply();
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