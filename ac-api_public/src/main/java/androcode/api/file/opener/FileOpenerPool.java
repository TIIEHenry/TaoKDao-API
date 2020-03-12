package androcode.api.file.opener;

import java.io.File;
import java.util.HashSet;

import androcode.base.identifiable.IdentifiablePool;

/**
 * FileOpener的统一管理
 */

public class FileOpenerPool extends IdentifiablePool<IFileOpener, String> {
    private static FileOpenerPool instance = new FileOpenerPool();

    public static FileOpenerPool getInstance() {
        return instance;
    }

    public static FileOpenerPool newInstance() {
        instance = new FileOpenerPool();
        return instance;
    }


    public HashSet<IFileOpener> get(File file) {
        HashSet<IFileOpener> list = new HashSet<>();
        for (IFileOpener value : getAll()) {
            if (value.isSupport(file)) {
                list.add(value);
            }
        }
        return list;
    }

}