package androcode.api.setting.preference;

import androcode.api.setting.preference.base.IOppositeStatePreference;
import androcode.api.setting.preference.base.PreferenceType;

public interface ICheckboxPreference extends IOppositeStatePreference {
    @Override
    default PreferenceType getPreferenceType() {
        return PreferenceType.TYPE_CHECKBOX;
    }

}
