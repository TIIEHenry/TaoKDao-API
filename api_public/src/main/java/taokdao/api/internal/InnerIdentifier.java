package taokdao.api.internal;

import androidx.annotation.Keep;

/**
 * 内置的各种组件id
 */
@Keep
public class InnerIdentifier {


    public static class TabTool {
        public static String EVENT = "taokdao.tabtool.event";
        public static String TIPS = "taokdao.tabtool.tips";
        public static String BUILD = "taokdao.tabtool.build";
        public static String SEARCH = "taokdao.tabtool.search";
        public static String LOGCAT = "taokdao.tabtool.logcat";
    }


    public static class Content {
        public static String CODE_EDITOR = "taokdao.content.codeeditor";
        public static String CODE_TEMPLATE_EDITOR = "taokdao.content.codeetemplateditor";
        public static String OPEN_FAILED = "taokdao.content.openfailed";
    }

    public static class Explorer {
        public static String FILE_EXPLORER = "taokdao.explorer.fileexplorer";
        public static String PROJECT_FILES = "taokdao.explorer.projectfiles";
        public static String PROJECT_STRUCTURE = "taokdao.explorer.projectstructure";
    }


    public static class ProjectPlugin {
        public static String PROJECT_FILES = Explorer.PROJECT_FILES;
        public static String PROJECT_STRUCTURE = Explorer.PROJECT_STRUCTURE;
    }

    public static class PluginEngine {
        public static String RHINO = "taokdao.plugin.engine.rhino";
        public static String DEX = "taokdao.plugin.engine.dex";
    }
}
