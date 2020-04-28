package taokdao.api.file.opener;

import androidx.annotation.NonNull;

import java.io.File;

public interface FileOpenerChecker {
    /**
     * @param file 文件
     * @return 操作是否支持
     */
    boolean isSupport(@NonNull File file);
}
