package taokdao.api.file.operate.wrapped;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.jetbrains.annotations.NotNull;

import taokdao.api.data.bean.Properties;
import taokdao.api.file.operate.FileOperatorCallback;
import taokdao.api.file.operate.FileOperatorChecker;
import taokdao.api.file.operate.IFileOperator;
import taokdao.api.main.IMainActivity;
import taokdao.base.annotation.relation.MainConstructor;


/**
 * 文件浏览器界面长按的菜单
 * 实现对文件操作
 */
public class FileOperator implements IFileOperator {
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
    public boolean isSupport(@NotNull String path) {
        return checker.isSupport(path);
    }

    @Override
    public boolean call(IMainActivity main, String path) {
        return callback.call(main, path);
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

    @Override
    public String toString() {
        return "FileOperate{" +
                "description='" + description + '\'' +
                ", id='" + id + '\'' +
                ", label='" + label + '\'' +
                ", icon=" + icon +
                ", checker=" + checker +
                ", callback=" + callback +
                '}';
    }
}
