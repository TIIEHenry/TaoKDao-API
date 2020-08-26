package taokdao.api.file.open.wrapped;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import taokdao.api.base.annotation.relation.MainConstructor;
import taokdao.api.data.bean.IProperties;
import taokdao.api.file.open.FileOpenerChecker;

/**
 * 实现对文件的打开操作
 */
public abstract class FileOpener extends BaseFileOpener {
    @NonNull
    protected FileOpenerChecker checker;

    @MainConstructor
    public FileOpener(@NonNull IProperties properties, @Nullable Drawable icon, @NonNull FileOpenerChecker checker) {
        super(properties, icon);
        this.checker = checker;
    }

    public FileOpener(@NonNull IProperties properties, FileOpenerChecker checker) {
        this(properties, null, checker);
    }

    @Override
    public boolean isSupport(@NonNull String path) {
        return checker.isSupport(path);
    }

    @NonNull
    @Override
    public String toString() {
        return "FileOpener{" +
                "checker=" + checker +
                ", id='" + id + '\'' +
                ", icon=" + icon +
                ", label='" + label + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

}
