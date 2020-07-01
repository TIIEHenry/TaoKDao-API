package taokdao.api.file.operate;

import taokdao.api.main.IMainActivity;

public interface FileOperatorCallback {
    boolean call(IMainActivity main, String path);
}
