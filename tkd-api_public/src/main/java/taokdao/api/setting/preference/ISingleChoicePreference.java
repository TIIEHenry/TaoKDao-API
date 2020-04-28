package taokdao.api.setting.preference;

import androidx.annotation.NonNull;

import java.util.Collection;

import taokdao.api.setting.preference.base.IPreference;
import taokdao.api.setting.preference.base.PreferenceType;

public interface ISingleChoicePreference extends IPreference<Integer> {
    @Override
    default PreferenceType getPreferenceType() {
        return PreferenceType.TYPE_CHOICE_SINGLE;
    }

    @NonNull
    String[] getItemList();

    void setItemList(@NonNull String[] items);

    default void setItemList(@NonNull Collection<String> items) {
        int i = 0;
        String[] array = new String[items.size()];
        for (String item : items) {
            array[i] = item;
            i++;
        }
        setItemList(array);
    }

    default void load() {
        String[] itemList = getItemList();
        Integer value = loadValue();
        onChosen(value, itemList[value]);
    }

    void onChosen(int which, @NonNull String text);

    interface Listener {
        void onChosen(int which, String text);
    }
}
