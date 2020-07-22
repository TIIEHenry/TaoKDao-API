package taokdao.api.file.operate;

import taokdao.api.main.IMainContext;

public interface FileOperatorCallback {
    boolean call(IMainContext main, String path);
}
