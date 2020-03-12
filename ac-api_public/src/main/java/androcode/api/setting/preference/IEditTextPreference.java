package androcode.api.setting.preference;

import androidx.annotation.NonNull;

import androcode.api.setting.preference.base.IPreference;
import androcode.api.setting.preference.base.PreferenceType;

public interface IEditTextPreference extends IPreference<String> {
    @Override
    default PreferenceType getPreferenceType() {
        return PreferenceType.TYPE_EDIT_TEXT;
    }

    /**
     * default InputType.TYPE_CLASS_TEXT
     *
     * @return InputType
     */
    int getInputType();

    void setInputType(int inputType);

    default void load() {
        onChanged(loadValue());
    }

    void onChanged(@NonNull String text);

    interface Listener {
        void onChange(@NonNull String text);
    }
}
