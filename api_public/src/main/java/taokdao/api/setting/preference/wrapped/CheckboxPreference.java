package taokdao.api.setting.preference.wrapped;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;

import taokdao.api.data.bean.Properties;
import taokdao.api.data.mmkv.IMMKV;
import taokdao.api.setting.preference.ICheckboxPreference;
import taokdao.api.setting.preference.base.OppositeStatePreference;

public class CheckboxPreference extends OppositeStatePreference implements ICheckboxPreference {

    public CheckboxPreference(@NonNull IMMKV mmkv, boolean defaultValue, @NonNull Properties properties, Drawable icon, Listener listener) {
        super(mmkv, defaultValue, properties, icon, listener);
    }

    public CheckboxPreference(@NonNull IMMKV sharedPreferences, boolean defaultValue, @NonNull Properties properties, Listener listener) {
        super(sharedPreferences, defaultValue, properties, null, listener);
    }


}
