package taokdao.api.file.util;

import java.io.File;

import taokdao.base.annotation.maintain.ShortTerm;

@ShortTerm
public class FileUtils {

    public static String getSuffix(File file) {
        return file.getPath().substring(file.getPath().lastIndexOf(".") + 1);
    }
}
