package androcode.api.file.operator.wrapped;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;

import androcode.api.bean.Properties;
import androcode.api.file.operator.FileOperatorCallback;
import androcode.api.file.operator.FileOperatorChecker;
import androcode.api.file.operator.IFileOperator;
import androcode.api.main.IMainActivity;
import androcode.base.annotation.relation.MainConstructor;


/**
 * 文件浏览器界面长按的菜单
 * 实现对文件操作
 */
public class FileOperator implements IFileOperator, FileOperatorCallback {
    private final String description;
    private final String id;
    public String label;
    public Drawable icon;
    private FileOperatorChecker checker;
    private FileOperatorCallback callback;


    @MainConstructor
    public FileOperator(@NonNull Properties properties, @Nullable Drawable icon, FileOperatorCallback callback, FileOperatorChecker checker) {
        this.id = properties.id;
        this.label = properties.label;
        this.description = properties.des;
        this.icon = icon;
        this.callback = callback;
        this.checker = checker;
    }

    public FileOperator(@NonNull Properties properties, FileOperatorCallback callback, FileOperatorChecker checker) {
        this(properties, null, callback, checker);
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

    @Nullable
    @Override
    public String getDescription() {
        return description;
    }

    @NonNull
    @Override
    public String id() {
        return id;
    }
}
