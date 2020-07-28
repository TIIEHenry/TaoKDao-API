package taokdao.api.internal;

import androidx.annotation.Keep;

/**
 * 内置的各种组件id
 */
@Keep
public class InnerIdentifier {


    public static class TabTool {
        public static final String EVENT = "taokdao.tabtools.event";
        public static final String TIPS = "taokdao.tabtools.tips";
        public static final String BUILD = "taokdao.tabtools.build";
        public static final String SEARCH = "taokdao.tabtools.search";
        public static final String LOGCAT = "taokdao.tabtools.logcat";
    }


    public static class Content {
        public static final String CODE_EDITOR = "taokdao.contents.codeeditor";
        public static final String CODE_TEMPLATE_EDITOR = "taokdao.contents.codeetemplateditor";
        public static final String OPEN_FAILED = "taokdao.contents.openfailed";
    }

    public static class Explorer {
        public static final String FILE_EXPLORER = "taokdao.explorers.fileexplorer";
        public static final String PROJECT_FILES = "taokdao.explorers.projectfiles";
        public static final String PROJECT_STRUCTURE = "taokdao.explorers.projectstructure";
    }


    public static class ProjectPlugin {
        public static final String PROJECT_FILES = Explorer.PROJECT_FILES;
        public static final String PROJECT_STRUCTURE = Explorer.PROJECT_STRUCTURE;
    }

    public static class PluginEngine {
        public static final String RHINO = "taokdao.plugin.engines.rhino";
        public static final String DEX = "taokdao.plugin.engines.dex";
        public static final String APK = "taokdao.plugin.engines.apk";
    }

    public static class Intent {
        public static final String PARAMETER_ACTION = "taokdao.main.intent.parameter.action";
        public static final String PARAMETER_PATH = "taokdao.main.intent.parameter.path";
        public static final String PARAMETER_PACKAGE = "taokdao.main.intent.parameter.package";
        public static final String ACTION_INSTALL_PLUGIN = "taokdao.main.intent.action.install_plugin";
    }
}
