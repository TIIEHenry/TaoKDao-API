package taokdao.api.file.operate.wrapped;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import taokdao.api.base.annotation.relation.MainConstructor;
import taokdao.api.data.bean.IProperties;
import taokdao.api.file.operate.FileOperatorCallback;
import taokdao.api.file.operate.FileOperatorChecker;


/**
 * 文件浏览器界面长按的菜单
 * 实现对文件操作
 */
public class FileOperator extends BaseFileOperator {
    protected FileOperatorChecker checker;

    @MainConstructor
    public FileOperator(@NonNull IProperties properties, @Nullable Drawable icon, FileOperatorCallback callback, FileOperatorChecker checker) {
        super(properties, icon, callback);
        this.checker = checker;
    }

    public FileOperator(@NonNull IProperties properties, FileOperatorCallback callback, FileOperatorChecker checker) {
        this(properties, null, callback, checker);
    }

    @Override
    public boolean isSupport(@NonNull String path) {
        return checker.isSupport(path);
    }

    @NonNull
    @Override
    public String toString() {
        return "FileOperator{" +
                "checker=" + checker +
                ", description='" + description + '\'' +
                ", id='" + id + '\'' +
                ", label='" + label + '\'' +
                ", icon=" + icon +
                ", callback=" + callback +
                '}';
    }
}
