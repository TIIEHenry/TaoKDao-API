package taokdao.api.file.operate.wrapped;

import static taokdao.api.file.util.FileUtils.getSuffix;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;
import java.util.ArrayList;

import taokdao.api.data.bean.IProperties;
import taokdao.api.file.base.FileType;
import taokdao.api.file.operate.FileOperatorCallback;

/**
 * FileOperator的包装，根据文件后缀匹配
 */
public class SuffixFileOperator extends BaseFileOperator {
    public FileType supportType = FileType.ALL;
    /**
     * 菜单根据文件后缀是否在supportSuffix中显示
     */
    protected ArrayList<String> supportSuffix = new ArrayList<>();
    /**
     * supportSuffix为空的情况下，默认为都支持，unSupportSuffix用来排除不支持的后缀
     */
    protected ArrayList<String> unSupportSuffix = new ArrayList<>();


    public SuffixFileOperator(@NonNull IProperties properties, @Nullable Drawable icon, FileOperatorCallback callback) {
        super(properties, icon, callback);
    }

    public SuffixFileOperator(@NonNull IProperties properties, FileOperatorCallback callback) {
        this(properties, null, callback);
    }


    private boolean isSupportSuffix(String suffix) {
        return supportSuffix.contains(suffix) ||
               (supportSuffix.size() == 0 && !unSupportSuffix.contains(suffix));
    }

    @Override
    public boolean isSupport(@NonNull String path) {
        File file = new File(path);
        if (supportType == FileType.ALL)
            return true;
        else if (supportType == FileType.FILE && file.isFile())
            return isSupportSuffix(getSuffix(file));
        else
            return supportType == FileType.DIRECTORY && file.isDirectory();
    }
}
