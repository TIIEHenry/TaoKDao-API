package androcode.api.setting.preference.base;

import androidx.annotation.NonNull;

import java.util.List;

public interface IGroupPreference extends IPreference<Object> {

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
