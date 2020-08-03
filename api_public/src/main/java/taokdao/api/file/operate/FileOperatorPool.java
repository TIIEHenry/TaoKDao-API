package taokdao.api.file.operate;

import java.io.File;
import java.util.HashSet;

import taokdao.api.base.identifiable.IdentifiablePool;

/**
 * FileOperator的统一管理
 */
public class FileOperatorPool extends IdentifiablePool<IFileOperator, String> {
    private static FileOperatorPool instance = new FileOperatorPool();

    public static FileOperatorPool getInstance() {
        return instance;
    }

    public static FileOperatorPool newInstance() {
        instance = new FileOperatorPool();
        return instance;
    }


    public HashSet<IFileOperator> getForPath(String path) {
        HashSet<IFileOperator> list = new HashSet<>();
        for (IFileOperator value : getAll()) {
            if (value.isSupport(path)) {
                list.add(value);
            }
        }
        return list;
    }

    public HashSet<IFileOperator> getForFile(File file) {
        return getForPath(file.getAbsolutePath());
    }

}
