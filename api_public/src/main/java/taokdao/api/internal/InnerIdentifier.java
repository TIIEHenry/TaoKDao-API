package taokdao.api.internal;

import androidx.annotation.Keep;

/**
 * 内置的各种组件id
 */
@Keep
public class InnerIdentifier {


    public static class ToolGroup {
        public static final String EVENT = "taokdao.toolgroup.event";
        public static final String TIPS = "taokdao.toolgroup.tips";
        public static final String BUILD = "taokdao.toolgroup.build";
        public static final String SEARCH = "taokdao.toolgroup.search";
        public static final String LOGCAT = "taokdao.toolgroup.logcat";
    }


    public static class Content {
        public static final String CODE_EDITOR = "taokdao.content.codeeditor";
        public static final String CODE_TEMPLATE_EDITOR = "taokdao.content.codeetemplateditor";
        public static final String OPEN_FAILED = "taokdao.content.openfailed";
    }

    public static class Explorer {
        public static final String FILE_EXPLORER = "taokdao.explorer.file.explorer";
        public static final String PROJECT_FILES = "taokdao.explorer.project.files";
        public static final String PROJECT_STRUCTURE = "taokdao.explorer.project.structure";
    }

    public static class ProjectPlugin {
        public static final String PROJECT_FILES = "taokdao.project.plugin.explorer.files";
        public static final String PROJECT_STRUCTURE = "taokdao.project.plugin.explorer.structure";
    }

    public static class PluginEngine {
        public static final String DEX = "taokdao.plugins.engine.dex";
        public static final String APK = "taokdao.plugins.engine.apk";
    }

    public static class Intent {
        public static final String PARAMETER_ACTION = "taokdao.main.intent.parameter.action";
        public static final String PARAMETER_PATH = "taokdao.main.intent.parameter.path";
        public static final String PARAMETER_PACKAGE = "taokdao.main.intent.parameter.package";
        public static final String ACTION_INSTALL_PLUGIN = "taokdao.main.intent.action.install_plugin";
    }

    public static class FileBuilder {
        public static final String HTML_VIEWER = "taokdao.file.builder.html.viewer";
        public static final String MARKDOWN_VIEWER = "taokdao.file.builder.markdown.viewer";
    }

    public static class MetaData {
        public static final String PARAMETER_TYPE = "taokdao.plugin.type";
        public static final String TYPE_PLUGIN_SETUP = "taokdao.plugin.setup";
        public static final String PARAMETER_PLUGIN_SRC_PATH = "taokdao.plugin.source";
    }
}
