package androcode.api.setting.preference.wrapped;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.text.InputType;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androcode.api.setting.preference.IEditTextPreference;
import androcode.api.setting.preference.base.IGroupPreference;
import androcode.base.annotation.relation.MainConstructor;

public class EditTextPreference implements IEditTextPreference {

    private final String id;
    private final Drawable icon;
    private final String title;
    private final String description;
    private final SharedPreferences sharedPreferences;
    private final Listener listener;
    private final String defaultValue;
    private IGroupPreference group;
    private boolean enable = true;
    private int inputType = InputType.TYPE_CLASS_TEXT;

    @MainConstructor
    public EditTextPreference(@NonNull SharedPreferences sharedPreferences, @NonNull String defaultValue, @NonNull String id, Drawable icon, String title, String description, Listener listener) {
        this.sharedPreferences = sharedPreferences;
        this.defaultValue = defaultValue;
        this.id = id;
        this.icon = icon;
        this.title = title;
        this.description = description;
        this.listener = listener;
    }

    public EditTextPreference(@NonNull SharedPreferences sharedPreferences, @NonNull String defaultValue, @NonNull String id, String title, String description, Listener listener) {
        this(sharedPreferences, defaultValue, id, null, title, description, listener);
    }

    public EditTextPreference(@NonNull SharedPreferences sharedPreferences, @NonNull String defaultValue, @NonNull String id, String title, Listener listener) {
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

    @Override
    public int getInputType() {
        return inputType;
    }

    @Override
    public void setInputType(int inputType) {
        this.inputType = inputType;
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
            listener.onChange(text);
    }

}
