package taokdao.api.setting.preference;

import android.view.View;

import androidx.annotation.NonNull;

import taokdao.api.setting.preference.base.IPreference;
import taokdao.api.setting.preference.base.PreferenceType;

public interface IClickablePreference extends IPreference<Object>, View.OnClickListener, View.OnLongClickListener {
    @Override
    default PreferenceType getPreferenceType() {
        return PreferenceType.TYPE_CLICKABLE;
    }

    default void load() {

    }

    @NonNull
    @Override
    default Object loadValue() {
        return new Object();
    }

    @Override
    default void saveValue(Object value){

    }

    @Override
    void onClick(View v);

    @Override
    default boolean onLongClick(View v) {
        return true;
    }
}
