package taokdao.api.file.util;

import java.io.File;

import taokdao.api.base.annotation.maintain.ShortTerm;

@ShortTerm
public class FileUtils {

    public static String getSuffix(File file) {
        return getSuffix(file.getPath());
    }

    public static String getSuffix(String path) {
        return path.substring(path.lastIndexOf(".") + 1);
    }

    /**
     * 获取 文件扩展名
     *
     * @param name name
     * @return String Extension
     */
    public static String getExtension(String name) {
        int index = name.lastIndexOf(".");
        if (index > 0) {
            return name.substring(index + 1);
        }
        return "";
    }

    public static String getNameWithoutExtension(File file) {
        String fileName = file.getName();
        int dotIndex = fileName.lastIndexOf('.');
        return dotIndex == -1 ? fileName : fileName.substring(0, dotIndex);
    }
    public static String getNameWithoutExtension(String file) {
        return getNameWithoutExtension(new File(file));
    }
}
