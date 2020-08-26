package taokdao.api.ui.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import taokdao.api.base.identifiable.Identifiable;

public interface ITab<ID, TAB extends Identifiable<ID>> {
    void add(@NonNull TAB tab, boolean select);

    default void add(@NonNull TAB tab) {
        add(tab, true);
    }

    boolean remove(@NonNull TAB tab);

    void clear();

    /**
     * 显示
     *
     * @param tab
     */
    void show(@NonNull TAB tab);

    @Nullable
    default TAB get(@NonNull ID id) {
        for (TAB tab : getAll()) {
            if (id.equals(tab.id()))
                return tab;
        }
        return null;
    }

    @NonNull
    List<TAB> getAll();

    @Nullable
    TAB getCurrent();
}
