package androcode.api.setting.preference;

import androidx.annotation.NonNull;

import androcode.api.setting.preference.base.IPreference;
import androcode.api.setting.preference.base.PreferenceType;

public interface ITextPreference extends IPreference<String> {
    @Override
    default PreferenceType getPreferenceType() {
        return PreferenceType.TYPE_TEXT;
    }

    default void load() {
        onChanged(loadValue());
    }

    void onChanged(@NonNull String text);

    interface Listener {
        void onChanged(@NonNull String text);
    }
}
