package androcode.api.setting.preference.wrapped;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;

import androcode.api.setting.preference.ICheckboxPreference;
import androcode.api.setting.preference.base.OppositeStatePreference;
import androcode.api.bean.Properties;

public class CheckboxPreference extends OppositeStatePreference implements ICheckboxPreference {

    public CheckboxPreference(@NonNull SharedPreferences sharedPreferences, boolean defaultValue, @NonNull Properties properties, Drawable icon,  Listener listener) {
        super(sharedPreferences, defaultValue, properties,icon, listener);
    }

    public CheckboxPreference(@NonNull SharedPreferences sharedPreferences, boolean defaultValue, @NonNull Properties properties, Listener listener) {
        super(sharedPreferences, defaultValue, properties,null, listener);
    }



}
