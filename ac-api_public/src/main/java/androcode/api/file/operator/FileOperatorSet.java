package androcode.api.file.operator;

import androidx.annotation.Nullable;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import androcode.api.file.operator.FileOperator;

/**
 * FileOperator的统一管理
 */
public class FileOperatorSet {

    private static HashMap<String, FileOperator> map = new HashMap<>();


    public static Set<FileOperator> get(File file) {
        HashSet<FileOperator> list = new HashSet<>();

        for (FileOperator value : getAll()) {
            if (value.checker.isSupport(file)) {
                list.add(value);
            }
        }
        return list;
    }

    public static HashSet<FileOperator> getAll() {
        return new HashSet<>(map.values());
    }

    public static boolean add(FileOperator operator) {
        FileOperator list = map.get(operator.label);
        if (list == null) {
            map.put(operator.label, operator);
            return true;
        }
        return false;
    }

    public static void addAll(FileOperator[] operators) {
        for (FileOperator opener : operators) {
            add(opener);
        }
    }

    public static boolean remove(FileOperator operator) {
        return remove(operator.label) != null;
    }

    public static FileOperator remove(String label) {
        return map.remove(label);
    }

    public static void removeAll(String[] labels) {
        for (String s : labels) {
            remove(s);
        }
    }

    public static void removeAll(FileOperator[] operators) {
        for (FileOperator s : operators) {
            remove(s);
        }
    }

    public static void clear() {
        map.clear();
    }

    @Nullable
    public static FileOperator get(String label) {
        return map.get(label);
    }
}
