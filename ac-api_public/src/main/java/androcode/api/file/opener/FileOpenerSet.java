package androcode.api.file.opener;

import androidx.annotation.Nullable;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;

import androcode.api.file.opener.FileOpener;

/**
 * FileOpener的统一管理
 */
public class FileOpenerSet {

    private static HashMap<String, FileOpener> map = new HashMap<>();


    public static HashSet<FileOpener> get(File file) {
        HashSet<FileOpener> list = new HashSet<>();

        for (FileOpener value : getAll()) {
            if (value.checker.isSupport(file)) {
                list.add(value);
            }
        }
        return list;
    }

    public static HashSet<FileOpener> getAll() {
        return new HashSet<>(map.values());
    }

    public static boolean add(FileOpener opener) {
        FileOpener list = map.get(opener.id);
        if (list == null) {
            map.put(opener.id, opener);
            return true;
        }
        return false;
    }

    public static void addAll(FileOpener[] openers) {
        for (FileOpener opener : openers) {
            add(opener);
        }
    }

    public static boolean remove(FileOpener opener) {
        return remove(opener.id) != null;
    }

    public static FileOpener remove(String label) {
        return map.remove(label);
    }

    public static void removeAll(String[] labels) {
        for (String s : labels) {
            remove(s);
        }
    }

    public static void removeAll(FileOpener[] openers) {
        for (FileOpener s : openers) {
            remove(s);
        }
    }

    public static void clear() {
        map.clear();
    }

    @Nullable
    public static FileOpener get(String id) {
        return map.get(id);
    }
}
