package androcode.api.file.operator;

import java.io.File;

import androcode.api.main.IMainActivity;

public interface FileOperatorCallback {
    boolean call(IMainActivity main, File file);
}
