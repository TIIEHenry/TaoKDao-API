package taokdao.api.file.operate.wrapped;

import androidx.annotation.NonNull;

import java.io.File;
import java.util.ArrayList;

import taokdao.api.file.base.FileType;
import taokdao.api.file.operate.IFileOperator;

import static taokdao.api.file.util.FileUtils.getSuffix;

public abstract class SuffixIFileOperator implements IFileOperator {
    protected FileType supportType = FileType.ALL;
    /**
     * 菜单根据文件后缀是否在supportSuffix中显示
     */
    protected ArrayList<String> supportSuffix = new ArrayList<>();
    /**
     * supportSuffix为空的情况下，默认为都支持，unSupportSuffix用来排除不支持的后缀
     */
    protected ArrayList<String> unSupportSuffix = new ArrayList<>();

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
