package taokdao.api.file.open;


import androidx.annotation.NonNull;

import java.util.HashSet;

import taokdao.api.base.identifiable.IdentifiablePool;

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


    public HashSet<IFileOpener> getForPath(@NonNull String path) {
        HashSet<IFileOpener> list = new HashSet<>();
        for (IFileOpener value : getAll()) {
            if (value.isSupport(path)) {
                list.add(value);
            }
        }
        return list;
    }

}