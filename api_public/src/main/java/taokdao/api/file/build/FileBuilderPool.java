package taokdao.api.file.build;

import androidx.annotation.Nullable;

import java.io.File;
import java.util.ArrayList;
import java.util.Locale;


public class FileBuilderPool {

    private static ArrayList<String> suffixes = new ArrayList<>();
    private static ArrayList<IFileBuilder> fileBuilders = new ArrayList<>();


    @Nullable
    public static IFileBuilder getFileBuilder(File config) {
        String suffix = getSuffix(config).toLowerCase(Locale.getDefault());
        return getFileBuilder(suffix);
    }

    @Nullable
    public static IFileBuilder getFileBuilder(String suffix) {
        for (IFileBuilder builder : getFileBuilderList()) {
            if (builder.getSuffixes().contains(suffix))
                return builder;
        }
        return null;
    }

    public static ArrayList<IFileBuilder> getFileBuilderList() {
        return fileBuilders;
    }

    public static boolean addFileBuilder(IFileBuilder builder) {
        for (String it : builder.getSuffixes()) {
            if (suffixes.contains(it))
                return false;
        }
        fileBuilders.add(builder);
        suffixes.addAll(builder.getSuffixes());
        return true;
    }

    public static boolean removeFileBuilder(IFileBuilder builder) {
        suffixes.removeAll(builder.getSuffixes());
        return fileBuilders.remove(builder);
    }

    public static IFileBuilder removeFileBuilder(String suffix) {
        IFileBuilder builder = null;
        for (IFileBuilder b : fileBuilders) {
            if (b.getSuffixes().contains(suffix))
                builder = b;
        }
        if (builder != null) {
            fileBuilders.remove(builder);
            suffixes.removeAll(builder.getSuffixes());
        }
        return builder;
    }

    private static String getSuffix(File file) {
        return file.getPath().substring(file.getPath().lastIndexOf(".") + 1);
    }

    public static void clear() {
        suffixes.clear();
        fileBuilders.clear();
    }
}
