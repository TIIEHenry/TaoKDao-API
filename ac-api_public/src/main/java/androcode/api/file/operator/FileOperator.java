package androcode.api.file.operator;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;

import androcode.api.main.IMainActivity;
import androcode.base.annotation.relation.MainConstructor;


/**
 * 文件浏览器界面长按的菜单
 * 实现对文件操作
 */
public class FileOperator implements IFileOperator, FileOperatorCallback {
    public String label;
    public Drawable icon;
    private FileOperatorChecker checker;
    private FileOperatorCallback callback;


    @MainConstructor
    public FileOperator(Drawable icon, String label, FileOperatorCallback callback, FileOperatorChecker checker) {
        this.icon = icon;
        this.label = label;
        this.callback = callback;
        this.checker = checker;
    }

    public FileOperator(String label, FileOperatorCallback callback, FileOperatorChecker checker) {
        this(null, label, callback, checker);
    }

    @Override
    public boolean isSupport(File file) {
        return checker.isSupport(file);
    }

    @Override
    public boolean call(IMainActivity main, File file) {
        return callback.call(main, file);
    }

    @Nullable
    @Override
    public Drawable getIcon() {
        return icon;
    }

    @NonNull
    @Override
    public String getLabel() {
        return label;
    }

    @NonNull
    @Override
    public String id() {
        return label;
    }
}
