package taokdao.api.setting.preference;

import androidx.annotation.NonNull;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import taokdao.api.setting.preference.base.IPreference;
import taokdao.api.setting.preference.base.PreferenceType;

public interface IMultiChoicePreference extends IPreference<Set<String>> {
    @Override
    default PreferenceType getPreferenceType() {
        return PreferenceType.TYPE_CHOICE_MULTI;
    }

    @NonNull
    String[] getItemList();

    void setItemList(@NonNull String[] items);

    default void setItemList(@NonNull Collection<String> items) {
        setItemList((String[]) items.toArray());
    }

    default void load() {
        String[] itemList = getItemList();
        Set<String> value = loadValue();
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < itemList.length; i++) {
            if (value.contains(itemList[i])) {
                map.put(i, itemList[i]);
            }
        }
        onChosen(map);
    }

    void onChosen(Map<Integer, String> result);

    interface Listener {
        void onChosen(Map<Integer, String> result);
    }
}
