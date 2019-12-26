package androcode.api.builder;

import java.io.File;
import java.util.ArrayList;
import java.util.Locale;

import androcode.api.activity.IMainActivity;
import androcode.api.builder.base.ICallback;
import androcode.api.project.ProjectConfig;

public class BuilderManager {

    private static ArrayList<String> suffixs = new ArrayList<>();
    private static ArrayList<IFileBuilder> fileBuilders = new ArrayList<>();
    private static ArrayList<IProjectBuilder> projectBuilders = new ArrayList<>();

    public static boolean runFile(IMainActivity activity, File config, ICallback<File> callback) {
        String suffix = getSuffix(config).toLowerCase(Locale.getDefault());
        for (IFileBuilder builder : fileBuilders) {
            if (builder.getSuffixs().contains(suffix))
                return builder.onRun(activity, config, callback);
        }
        return false;
    }

    public static boolean buildFile(IMainActivity activity, File config, ICallback<File> callback) {
        String suffix = getSuffix(config).toLowerCase(Locale.getDefault());
        for (IFileBuilder builder : fileBuilders) {
            if (builder.getSuffixs().contains(suffix))
                return builder.onBuild(activity, config, callback);
        }
        return false;
    }

    public static boolean runProject(IMainActivity activity, ProjectConfig config, ICallback<ProjectConfig> callback) {
        for (IProjectBuilder b : projectBuilders) {
            if (b.getId().equals(config.builder)) {
                return b.onRun(activity, config, callback);
            }
        }
        return false;
    }

    public static boolean buildProject(IMainActivity activity, ProjectConfig config, ICallback<ProjectConfig> callback) {
        for (IProjectBuilder b : projectBuilders) {
            if (b.getId().equals(config.builder)) {
                return b.onBuild(activity, config, callback);
            }
        }
        return false;
    }


    public static boolean addFileBuilder(IFileBuilder builder) {
        for (String it : builder.getSuffixs()) {
            if (suffixs.contains(it))
                return false;
        }
        fileBuilders.add(builder);
        suffixs.addAll(builder.getSuffixs());
        return true;
    }

    public static boolean removeFileBuilder(IFileBuilder builder) {
        suffixs.removeAll(builder.getSuffixs());
        return fileBuilders.remove(builder);
    }

    public static IFileBuilder removeFileBuilder(String suffix) {
        IFileBuilder builder = null;
        for (IFileBuilder b : fileBuilders) {
            if (b.getSuffixs().contains(suffix))
                builder = b;
        }
        if (builder != null) {
            fileBuilders.remove(builder);
            suffixs.removeAll(builder.getSuffixs());
        }
        return builder;
    }
    public static boolean addProjectBuilder(IProjectBuilder builder) {
        return projectBuilders.add(builder);
    }

    public static boolean removeProjectBuilder(IProjectBuilder builder) {
        return projectBuilders.remove(builder);
    }

    public static IProjectBuilder removeProjectBuilder(String id) {
        IProjectBuilder builder=null;
        for (IProjectBuilder b : projectBuilders) {
            if (b.getId().equals(id)) {
                builder=b;
            }
        }
        if (builder!=null){
            projectBuilders.remove(builder);
        }
        return builder;
    }

    private static String getSuffix(File file) {
        return file.getPath().substring(file.getPath().lastIndexOf(".") + 1);
    }
}
