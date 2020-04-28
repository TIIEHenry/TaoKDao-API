package taokdao.api.file.operator;

import java.io.File;
import java.util.HashSet;

import taokdao.base.identifiable.IdentifiablePool;

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


    public HashSet<IFileOperator> get(File file) {
        HashSet<IFileOperator> list = new HashSet<>();
        for (IFileOperator value : getAll()) {
            if (value.isSupport(file)) {
                list.add(value);
            }
        }
        return list;
    }

}
