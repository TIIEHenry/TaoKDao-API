package taokdao.api.file.build;

import androidx.annotation.NonNull;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;


public class FileBuilderPool {
    private static FileBuilderPool instance = new FileBuilderPool();

    public static FileBuilderPool getInstance() {
        return instance;
    }

    public static FileBuilderPool newInstance() {
        instance = new FileBuilderPool();
        return instance;
    }

    private HashMap<String, ArrayList<IFileBuilder>> fileBuilderMap = new HashMap<>();


    @NonNull
    public ArrayList<IFileBuilder> getList(File config) {
        String suffix = getSuffix(config).toLowerCase(Locale.getDefault());
        return getList(suffix);
    }

    @NonNull
    public ArrayList<IFileBuilder> getList(String suffix) {
        ArrayList<IFileBuilder> list = fileBuilderMap.get(suffix);
        if (list == null) {
            list = new ArrayList<>();
        }
        fileBuilderMap.put(suffix, list);
        return list;
    }

    public void add(IFileBuilder builder) {
        for (String it : builder.getSuffixes()) {
            getList(it).add(builder);
        }
    }

    public void remove(IFileBuilder builder) {
        for (String it : builder.getSuffixes()) {
            getList(it).remove(builder);
        }
    }


    public void removeFileBuilders(String suffix) {
        getList(suffix).clear();
    }

    private String getSuffix(File file) {
        return file.getPath().substring(file.getPath().lastIndexOf(".") + 1);
    }

    public void clear() {
        fileBuilderMap.clear();
    }
}
