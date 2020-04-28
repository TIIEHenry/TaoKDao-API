package taokdao.api.setting.preference;

import androidx.annotation.NonNull;

import taokdao.api.setting.preference.base.IPreference;
import taokdao.api.setting.preference.base.PreferenceType;

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
