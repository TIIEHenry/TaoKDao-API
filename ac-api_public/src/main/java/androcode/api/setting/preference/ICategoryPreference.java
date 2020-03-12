package androcode.api.setting.preference;

import androidx.annotation.NonNull;

import java.util.List;

import androcode.api.setting.preference.base.IGroupPreference;
import androcode.api.setting.preference.base.IPreference;
import androcode.api.setting.preference.base.PreferenceType;

public interface ICategoryPreference extends IGroupPreference {
    @Override
    default PreferenceType getPreferenceType() {
        return PreferenceType.TYPE_CATEGORY;
    }

    @NonNull
    List<IPreference<?>> getNumberList();

    void setNumberList(@NonNull List<IPreference<?>> list);
}
