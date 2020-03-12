package androcode.api.file.operator;

import android.graphics.drawable.Drawable;

import java.io.File;
import java.util.ArrayList;

import static androcode.api.file.FileUtils.getSuffix;

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
     * supportSuffix为空的情况下，默认为都支持，unsupportSuffix用来排除不支持的后缀
     */
    public ArrayList<String> unsupportSuffix = new ArrayList<>();


    public SuffixFileOperator(Drawable icon, String label, FileOperatorCallback callback) {
        super(icon, label, callback, null);
    }

    public SuffixFileOperator(String label, FileOperatorCallback callback) {
        this(null, label, callback);
    }

    public boolean isSupportSuffix(String suffix) {
        return supportSuffix.contains(suffix) ||
                (supportSuffix.size() == 0 && !unsupportSuffix.contains(suffix));
    }

    @Override
    public boolean isSupport(File file) {
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
