package taokdao.api.setting.preference;

import androidx.annotation.NonNull;

import java.util.List;

import taokdao.api.setting.preference.base.IGroupPreference;
import taokdao.api.setting.preference.base.IPreference;
import taokdao.api.setting.preference.base.PreferenceType;

public interface ICategoryPreference extends IGroupPreference {
    @Override
    default PreferenceType getPreferenceType() {
        return PreferenceType.TYPE_CATEGORY;
    }

    @NonNull
    List<IPreference<?>> getNumberList();

    void setNumberList(@NonNull List<IPreference<?>> list);

    @Override
    default void load() {
        List<IPreference<?>> list = getNumberList();
        for (IPreference<?> iPreference : list) {
            iPreference.load();
        }
    }
}
