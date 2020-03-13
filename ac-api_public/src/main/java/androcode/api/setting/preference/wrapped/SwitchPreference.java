package androcode.api.setting.preference.wrapped;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;

import androcode.api.setting.preference.ISwitchPreference;
import androcode.api.setting.preference.base.OppositeStatePreference;
import androcode.api.bean.Properties;

public class SwitchPreference extends OppositeStatePreference implements ISwitchPreference {


    public SwitchPreference(@NonNull SharedPreferences sharedPreferences, boolean defaultValue, @NonNull Properties properties, Drawable icon, Listener listener) {
        super(sharedPreferences, defaultValue, properties, icon, listener);
    }

    public SwitchPreference(@NonNull SharedPreferences sharedPreferences, boolean defaultValue, @NonNull Properties properties, Listener listener) {
        super(sharedPreferences, defaultValue, properties, listener);
    }



}
