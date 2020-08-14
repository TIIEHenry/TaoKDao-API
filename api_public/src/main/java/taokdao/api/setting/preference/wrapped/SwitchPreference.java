package taokdao.api.setting.preference.wrapped;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;


import taokdao.api.data.bean.Properties;
import taokdao.api.data.mmkv.IMMKV;
import taokdao.api.setting.preference.ISwitchPreference;
import taokdao.api.setting.preference.base.OppositeStatePreference;

public class SwitchPreference extends OppositeStatePreference implements ISwitchPreference {


    public SwitchPreference(@NonNull IMMKV mmkv, boolean defaultValue, @NonNull Properties properties, Drawable icon, Listener listener) {
        super(mmkv, defaultValue, properties, icon, listener);
    }

    public SwitchPreference(@NonNull IMMKV mmkv, boolean defaultValue, @NonNull Properties properties, Listener listener) {
        super(mmkv, defaultValue, properties, listener);
    }


}
