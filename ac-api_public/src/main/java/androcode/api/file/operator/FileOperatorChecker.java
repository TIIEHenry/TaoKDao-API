package androcode.api.file.operator;

import java.io.File;

/**
 * check support can operate
 */
public interface FileOperatorChecker {
    boolean isSupport(File file);
}
