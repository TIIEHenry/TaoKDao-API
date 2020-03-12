package androcode.base.identifiable;

import androidx.annotation.NonNull;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;


public class IdentifiablePool<T extends Identifiable<D>, D> {

    public HashMap<D, T> map = new HashMap<>();

    /**
     * @param o T
     * @return isSuccess
     */
    public boolean add(@NonNull T o) {
        if (map.get(o.id()) == null) {
            map.put(o.id(), o);
            return true;
        }
        return false;
    }

    public T get(@NonNull D id) {
        return map.get(id);
    }

    public void addAll(@NonNull T[] os) {
        for (T o : os) {
            add(o);
        }
    }

    public T remove(@NonNull D id) {
        return map.remove(id);
    }

    public void remove(@NonNull T template) {
        remove(template.id());
    }

    public void removeAll(@NonNull T[] os) {
        for (T o : os) {
            remove(o);
        }
    }

    public void removeAll(@NonNull Collection<T> os) {
        for (T o : os) {
            remove(o);
        }
    }

    public boolean contains(@NonNull D id) {
        return map.get(id) != null;
    }

    public boolean contains(@NonNull T template) {
        return contains(template.id());
    }

    public boolean containsAll(@NonNull T[] template) {
        return containsAll(Arrays.asList(template));
    }

    public boolean containsAll(@NonNull Collection<T> template) {
        return getAll().containsAll(template);
    }

    public HashSet<T> getAll() {
        return new HashSet<>(map.values());
    }

    public void clear() {
        map.clear();
    }
}
