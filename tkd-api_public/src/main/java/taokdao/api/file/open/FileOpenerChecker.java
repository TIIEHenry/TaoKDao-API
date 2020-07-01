package taokdao.api.file.open;

import androidx.annotation.NonNull;

public interface FileOpenerChecker {
    /**
     * @param path 文件路径
     * @return 操作是否支持
     */
    boolean isSupport(@NonNull String path);
}
