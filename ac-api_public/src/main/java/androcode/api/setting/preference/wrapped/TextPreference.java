package androcode.api.setting.preference.wrapped;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androcode.api.setting.preference.ITextPreference;
import androcode.api.setting.preference.base.IGroupPreference;
import androcode.base.annotation.relation.MainConstructor;


public class TextPreference implements ITextPreference {

    private final String id;
    private final Drawable icon;
    private final String title;
    private final String description;
    private final SharedPreferences sharedPreferences;
    private final Listener listener;
    private final String defaultValue;
    private IGroupPreference group;
    private boolean enable = true;

    @MainConstructor
    public TextPreference(@NonNull SharedPreferences sharedPreferences, @NonNull String defaultValue, @NonNull String id, Drawable icon, String title, String description, Listener listener) {
        this.sharedPreferences = sharedPreferences;
        this.defaultValue = defaultValue;
        this.id = id;
        this.icon = icon;
        this.title = title;
        this.description = description;
        this.listener = listener;
    }

    public TextPreference(@NonNull SharedPreferences sharedPreferences, @NonNull String defaultValue, @NonNull String id, String title, String description, Listener listener) {
        this(sharedPreferences, defaultValue, id, null, title, description, listener);
    }

    public TextPreference(@NonNull SharedPreferences sharedPreferences, @NonNull String defaultValue, @NonNull String id, String title, Listener listener) {
        this(sharedPreferences, defaultValue, id, null, title, null, listener);
    }

    @NonNull
    @Override
    public String loadValue() {
        return sharedPreferences.getString(getIdWithGroup(), defaultValue);
    }

    @Override
    public void saveValue(String value) {
        sharedPreferences.edit().putString(getIdWithGroup(), value).apply();
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


    @Override
    public void onChanged(@NonNull String text) {
        saveValue(text);
        if (listener != null)
            listener.onChanged(text);
    }

}