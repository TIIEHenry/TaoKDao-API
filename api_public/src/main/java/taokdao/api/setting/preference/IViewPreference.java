package taokdao.api.setting.preference;

import android.view.View;

import androidx.annotation.NonNull;

import taokdao.api.main.IMainContext;
import taokdao.api.setting.preference.base.IPreference;
import taokdao.api.setting.preference.base.PreferenceType;

public interface IViewPreference extends IPreference<Object> {
    @Override
    default PreferenceType getPreferenceType() {
        return PreferenceType.TYPE_VIEW;
    }

    @NonNull
    View onCreateView(IMainContext main);

    void onDestroyView(@NonNull View view);
}
