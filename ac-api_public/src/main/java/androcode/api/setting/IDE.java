package androcode.api.setting;

import android.content.SharedPreferences;

public class IDE {
    public static void init(SharedPreferences sp) {
        Theme.isDark = sp.getBoolean(Theme.Key.isDark, false);

        AutoOpen.enable = sp.getBoolean(AutoOpen.Key.enable, true);
        AutoOpen.lastFiles = sp.getBoolean(AutoOpen.Key.lastFiles, true);
        AutoOpen.lastProject = sp.getBoolean(AutoOpen.Key.lastProject, true);

    }

    public static class Theme {

        public static boolean isDark;

        public static class Key {
            public static String isDark = "IDE.Theme.isDark";
        }
    }

    public static class AutoOpen {

        public static boolean enable;
        public static boolean lastFiles;
        public static boolean lastProject;

        public static class Key {
            public static String enable = "IDE.AutoOpen.enable";
            public static String lastFiles = "IDE.AutoOpen.lastFiles";
            public static String lastProject = "IDE.AutoOpen.lastProject";

            public static String lastFilesList = "IDE.AutoOpen.lastFilesList";
            public static String lastProjectPath = "IDE.AutoOpen.lastProjectPath";
        }
    }
}
