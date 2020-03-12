package androcode.api.internal;

/**
 * 内置的各种组件id
 */
public class InnerIdentifier {


    public static class TabContentIdentifier {
        public static String CODE_EDITOR = "androcode.codeeditor";
        public static String OPEN_FAILED = "androcode.openfailed";
    }

    public static class ExplorerIdentifier {
        public static String FILE_EXPLORER = "androcode.fileexplorer";
        public static String PROJECT_FILES = ProjectPluginIdentifier.PROJECT_FILES;
        public static String PROJECT_STRUCTURE = ProjectPluginIdentifier.PROJECT_STRUCTURE;
    }


    public static class ProjectPluginIdentifier {
        public static String PROJECT_FILES = "androcode.projectfiles";
        public static String PROJECT_STRUCTURE = "androcode.projectstructure";
    }

    public static class PluginEngineIdentifier {
        public static String RHINO = "androcode.plugin.engine.rhino";
        public static String DEX = "androcode.plugin.engine.dex";
    }
}
