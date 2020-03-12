package androcode.api.setting.preference.wrapped;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;

import androcode.api.setting.preference.ISwitchPreference;
import androcode.api.setting.preference.base.OppositeStatePreference;

public class SwitchPreference extends OppositeStatePreference implements ISwitchPreference {


    public SwitchPreference(@NonNull SharedPreferences sharedPreferences, boolean defaultValue, @NonNull String id, Drawable icon, String title, String description, Listener listener) {
        super(sharedPreferences, defaultValue, id, icon, title, description, listener);
    }

    public SwitchPreference(@NonNull SharedPreferences sharedPreferences, boolean defaultValue, @NonNull String id, String title, String description, Listener listener) {
        super(sharedPreferences, defaultValue, id, title, description, listener);
    }

    public SwitchPreference(@NonNull SharedPreferences sharedPreferences, boolean defaultValue, @NonNull String id, String title, Listener listener) {
        super(sharedPreferences, defaultValue, id, title, listener);
    }


}
