package androcode.api.explorer;

import androidx.annotation.Nullable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public interface IFileOpenerManager {
    HashMap<String, Set<FileOpener>> map = new HashMap<>();

    default boolean add(String suffix, FileOpener opener) {
        Set<FileOpener> list = map.get(suffix);
        if (list == null) {
            list = new HashSet<>();
            map.put(suffix, list);
        }
        FileOpener fileOpener = null;
        for (FileOpener o : list) {
            if (o.id.equals(opener.id)) {
                fileOpener = o;
            }
        }
        if (fileOpener != null)
            list.remove(opener);
        return list.add(opener);
    }

    default void add(String[] suffix, FileOpener opener) {
        for (String s : suffix) {
            add(s, opener);
        }
    }

    default Set<FileOpener> get(String suffix) {
        Set<FileOpener> list = map.get(suffix);
        if (list == null) {
            list = new HashSet<>();
            map.put(suffix, list);
        }
        return list;
    }

    default HashSet<FileOpener> getAll() {
        HashSet<FileOpener> openers=new HashSet<>();
        for (Set<FileOpener> value : map.values()) {
            openers.addAll(value);
        }
        return openers;
    }

    default boolean remove(String suffix, FileOpener opener) {
        Set<FileOpener> list = map.get(suffix);
        if (list == null) {
            return false;
        }
        return list.remove(opener);
    }

    default boolean remove(String suffix, String id) {
        Set<FileOpener> list = map.get(suffix);
        if (list == null) {
            return false;
        }
        FileOpener fileOpener = null;
        for (FileOpener o : list) {
            if (o.id.equals(id)) {
                fileOpener = o;
            }
        }
        if (fileOpener == null)
            return false;
        return list.remove(fileOpener);
    }

    default void remove(String[] suffixes, FileOpener opener) {
        for (String s : suffixes) {
            remove(s, opener);
        }
    }

    default void remove(String[] suffixes, String id) {
        for (String s : suffixes) {
            remove(s, id);
        }
    }

    default void clear() {
        map.clear();
    }

    @Nullable
    default FileOpener getForId(String id) {
        for (Set<FileOpener> value : map.values()) {
            for (FileOpener opener : value) {
                if (opener.id.equals(id))
                    return opener;
            }
        }
        return null;
    }

}
