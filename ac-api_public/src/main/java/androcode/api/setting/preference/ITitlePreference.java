package androcode.api.setting.preference;

import androcode.api.setting.preference.base.IGroupPreference;
import androcode.api.setting.preference.base.PreferenceType;

public interface ITitlePreference extends IGroupPreference {

    @Override
    default PreferenceType getPreferenceType() {
        return PreferenceType.TYPE_TITLE;
    }
}
