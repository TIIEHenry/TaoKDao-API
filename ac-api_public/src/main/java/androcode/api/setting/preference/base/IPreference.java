package androcode.api.setting.preference.base;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androcode.base.enable.IEnable;
import androcode.base.identifiable.Identifiable;

public interface IPreference<V> extends Identifiable<String>, IEnable {
    /**
     * 获取已保存的数据
     *
     * @return Value
     */
    @NonNull
    V loadValue();

    void saveValue(V value);

    @NonNull
    default String getIdWithGroup() {
        if (getGroup() != null)
            return getGroup().id() + "_" + id();
        return id();
    }

    PreferenceType getPreferenceType();

    @NonNull
    String getTitle();

    @Nullable
    Drawable getIcon();

    @Nullable
    String getDescription();

    @Nullable
    IGroupPreference getGroup();

    void setGroup(IGroupPreference group);
}
