package taokdao.api.file.operate.wrapped;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.ArrayList;

import taokdao.api.data.bean.Properties;
import taokdao.api.file.operate.FileOperatorCallback;
import taokdao.api.file.operate.FileOperatorChecker;

import static taokdao.api.file.util.FileUtils.getSuffix;

/**
 * FileOperator的包装，根据文件后缀匹配
 */
public class SuffixFileOperator extends FileOperator implements FileOperatorChecker {
    public Type type = Type.ALL;
    /**
     * 菜单根据文件后缀是否在supportSuffix中显示
     */
    public ArrayList<String> supportSuffix = new ArrayList<>();
    /**
     * supportSuffix为空的情况下，默认为都支持，unSupportSuffix用来排除不支持的后缀
     */
    public ArrayList<String> unSupportSuffix = new ArrayList<>();


    public SuffixFileOperator(@NonNull Properties properties, @Nullable Drawable icon, FileOperatorCallback callback) {
        super(properties, icon, callback, null);
    }

    public SuffixFileOperator(@NonNull Properties properties, FileOperatorCallback callback) {
        this(properties, null, callback);
    }

    public boolean isSupportSuffix(String suffix) {
        return supportSuffix.contains(suffix) ||
                (supportSuffix.size() == 0 && !unSupportSuffix.contains(suffix));
    }

    @Override
    public boolean isSupport(@NotNull String path) {
        File file = new File(path);
        if (type == Type.ALL)
            return true;
        else if (type == Type.FILE && file.isFile())
            return isSupportSuffix(getSuffix(file));
        else
            return type == Type.DIRECTORY && file.isDirectory();
    }

    public enum Type {
        FILE, DIRECTORY, ALL
    }
}
