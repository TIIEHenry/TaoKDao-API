package androcode.api.setting.preference;

import android.view.View;

import androidx.annotation.NonNull;

import androcode.api.main.IMainActivity;
import androcode.api.setting.preference.base.IPreference;
import androcode.api.setting.preference.base.PreferenceType;

public interface IViewPreference extends IPreference<Object> {
    @Override
    default PreferenceType getPreferenceType() {
        return PreferenceType.TYPE_VIEW;
    }

    @NonNull
    View onCreateView(IMainActivity main);

    void onDestroyView(@NonNull View view);
}
