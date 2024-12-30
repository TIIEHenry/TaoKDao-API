package taokdao.api.file.operate;

import androidx.annotation.NonNull;

import taokdao.api.main.IMainContext;

public interface FileOperatorCallback {
    boolean call(@NonNull IMainContext main, @NonNull String path);
}
