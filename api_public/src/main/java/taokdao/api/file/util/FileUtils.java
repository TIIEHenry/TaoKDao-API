package taokdao.api.file.util;

import java.io.File;

import taokdao.base.annotation.maintain.ShortTerm;

@ShortTerm
public class FileUtils {

    public static String getSuffix(File file) {
        return getSuffix(file.getPath());
    }

    public static String getSuffix(String path) {
        return path.substring(path.lastIndexOf(".") + 1);
    }
}
