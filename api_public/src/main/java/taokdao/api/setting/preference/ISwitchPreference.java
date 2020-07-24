package taokdao.api.setting.preference;

import taokdao.api.setting.preference.base.IOppositeStatePreference;
import taokdao.api.setting.preference.base.PreferenceType;

public interface ISwitchPreference extends IOppositeStatePreference {
    @Override
    default PreferenceType getPreferenceType() {
        return PreferenceType.TYPE_SWITCH;
    }
}
