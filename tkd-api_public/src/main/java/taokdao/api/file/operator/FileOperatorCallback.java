package taokdao.api.file.operator;

import java.io.File;

import taokdao.api.main.IMainActivity;

public interface FileOperatorCallback {
    boolean call(IMainActivity main, File file);
}
