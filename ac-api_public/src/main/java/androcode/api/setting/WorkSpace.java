package androcode.api.setting;

import androidx.annotation.NonNull;

import java.io.File;

/**
 * WorkSpace class
 *
 * @author TIIEHenry
 * @date 2019/04/25
 */
public class WorkSpace {
    public static String init(File workPath) {
        Dir.workDir = workPath.getAbsolutePath() + "/";
        Dir.backupDir = Dir.workDir + "Backup/";
        Dir.crashDir = Dir.workDir + "Crash/";
        Dir.editorDir = Dir.workDir + "Editor/";
        Dir.exportedDir = Dir.workDir + "Exported/";
        Dir.publicDir = Dir.workDir + "Public/";
        Dir.projectDir = Dir.workDir + "Project/";
        Dir.pluginDir = Dir.workDir + "Plugin/";
        Dir.themeDir = Dir.workDir + "Theme/";
        Dir.Editor.fontDir = Dir.editorDir + "font/";
        Dir.Editor.themeDir = Dir.editorDir + "theme/";
        Dir.Public.libsDir = Dir.publicDir + "libs/";
        Dir.Public.jniLibsDir = Dir.publicDir + "jniLibs/";
        Dir.Public.m2repositoryDir = Dir.publicDir + "m2repository/";
        return Dir.workDir;
    }

    public static String mkdirs() {
        new File(Dir.backupDir).mkdirs();
        new File(Dir.crashDir).mkdirs();
        new File(Dir.exportedDir).mkdirs();
        new File(Dir.projectDir).mkdirs();
        new File(Dir.pluginDir).mkdirs();
        new File(Dir.themeDir).mkdirs();
        new File(Dir.Editor.fontDir).mkdirs();
        new File(Dir.Editor.themeDir).mkdirs();
        new File(Dir.Public.libsDir).mkdirs();
        new File(Dir.Public.jniLibsDir).mkdirs();
        new File(Dir.Public.m2repositoryDir).mkdirs();
        return Dir.workDir;
    }

    public static class Dir {
        public static String workDir;
        public static String backupDir;
        public static String crashDir;
        public static String editorDir;
        public static String exportedDir;
        public static String publicDir;
        public static String projectDir;
        public static String pluginDir;
        public static String themeDir;

        public static class Editor {
            public static String fontDir;
            public static String themeDir;
        }

        public static class Public {
            public static String libsDir;
            public static String jniLibsDir;
            public static String m2repositoryDir;
        }
    }

    public static class DEX {
        @NonNull
        public static String srcDir;
    }
}
