package taokdao.api.internal;

import androidx.annotation.Keep;

/**
 * 内置的各种组件id
 */
@Keep
public class InnerIdentifier {


    public static class TabToolIdentifier {
        public static String EVENT = "taokdao.tabtool.event";
        public static String TIPS = "taokdao.tabtool.tips";
        public static String BUILD = "taokdao.tabtool.build";
        public static String SEARCH = "taokdao.tabtool.search";
        public static String LOGCAT = "taokdao.tabtool.logcat";
    }


    public static class ContentIdentifier {
        public static String CODE_EDITOR = "taokdao.tabcontent.codeeditor";
        public static String CODE_TEMPLATE_EDITOR = "taokdao.tabcontent.codeetemplateditor";
        public static String OPEN_FAILED = "taokdao.tabcontent.openfailed";
    }

    public static class ExplorerIdentifier {
        public static String FILE_EXPLORER = "taokdao.explorer.fileexplorer";
        public static String PROJECT_FILES = "taokdao.explorer.projectfiles";
        public static String PROJECT_STRUCTURE = "taokdao.explorer.projectstructure";
    }


    public static class ProjectPluginIdentifier {
        public static String PROJECT_FILES = ExplorerIdentifier.PROJECT_FILES;
        public static String PROJECT_STRUCTURE = ExplorerIdentifier.PROJECT_STRUCTURE;
    }

    public static class PluginEngineIdentifier {
        public static String RHINO = "taokdao.plugin.engine.rhino";
        public static String DEX = "taokdao.plugin.engine.dex";
    }
}
