package taokdao.api.setting.preference;

import taokdao.api.setting.preference.base.IGroupPreference;
import taokdao.api.setting.preference.base.PreferenceType;

public interface ITitlePreference extends IGroupPreference {

    @Override
    default PreferenceType getPreferenceType() {
        return PreferenceType.TYPE_TITLE;
    }


    @Override
    default void load() {
    }
}
