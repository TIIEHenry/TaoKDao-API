package taokdao.api.file.operate;

import androidx.annotation.NonNull;

/**
 * check support can operate
 */
public interface FileOperatorChecker {
    boolean isSupport(@NonNull String path);
}
