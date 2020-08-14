package taokdao.api.data.mmkv;


import androidx.annotation.NonNull;

import taokdao.api.plugin.bean.Plugin;
import taokdao.api.plugin.bean.PluginManifest;
import taokdao.api.plugin.engine.IPluginEngine;
import taokdao.api.project.plugin.IProjectPlugin;
import taokdao.api.ui.content.IContent;
import taokdao.api.ui.window.explorer.IExplorer;
import taokdao.api.ui.window.tabtool.ITabTool;

/**
 * 保存各种设置
 */
public interface IMMKVManager {

    @NonNull
    IMMKV getGlobalMMKV();

    @NonNull
    IMMKV getMMKV(@NonNull String name);

    default IMMKV getProjectPluginMMKV(@NonNull IProjectPlugin projectPlugin) {
        return getMMKV("project_plugin_" + projectPlugin.id());
    }

    @NonNull
    default IMMKV getPluginMMKV(@NonNull PluginManifest pluginManifest) {
        return getMMKV("plugin_" + pluginManifest.id);
    }

    @NonNull
    default IMMKV getPluginEngineMMKV(@NonNull IPluginEngine pluginEngine) {
        return getMMKV("plugin_engine_" + pluginEngine.id());
    }

    @NonNull
    default IMMKV getPluginMMKV(@NonNull Plugin plugin) {
        return getMMKV("plugin_" + plugin.id);
    }

    @NonNull
    default IMMKV getContentMMKV(@NonNull IContent tabContent) {
        return getMMKV("content_" + tabContent.id());
    }

    @NonNull
    default IMMKV getTabToolMMKV(@NonNull ITabTool tabTool) {
        return getMMKV("tabtool_" + tabTool.id());
    }

    @NonNull
    default IMMKV getExplorerMMKV(@NonNull IExplorer explorer) {
        return getMMKV("explorer_" + explorer.id());
    }

}
