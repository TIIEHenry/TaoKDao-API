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

    default IMMKV getProjectPluginMMKV(@NonNull String id) {
        return getMMKV("project_plugin_" + id);
    }

    @NonNull
    default IMMKV getPluginMMKV(@NonNull String id) {
        return getMMKV("plugin_" + id);
    }

    @NonNull
    default IMMKV getPluginEngineMMKV(@NonNull String id) {
        return getMMKV("plugin_engine_" + id);
    }

    @NonNull
    default IMMKV getContentMMKV(@NonNull String id) {
        return getMMKV("content_" + id);
    }

    @NonNull
    default IMMKV getTabToolMMKV(@NonNull String id) {
        return getMMKV("tabtool_" + id);
    }

    @NonNull
    default IMMKV getExplorerMMKV(@NonNull String id) {
        return getMMKV("explorer_" + id);
    }


    default IMMKV getProjectPluginMMKV(@NonNull IProjectPlugin projectPlugin) {
        return getProjectPluginMMKV(projectPlugin.id());
    }

    @NonNull
    default IMMKV getPluginMMKV(@NonNull PluginManifest pluginManifest) {
        return getPluginMMKV(pluginManifest.id);
    }

    @NonNull
    default IMMKV getPluginEngineMMKV(@NonNull IPluginEngine pluginEngine) {
        return getPluginEngineMMKV(pluginEngine.id());
    }

    @NonNull
    default IMMKV getPluginMMKV(@NonNull Plugin plugin) {
        return getPluginMMKV(plugin.id);
    }

    @NonNull
    default IMMKV getContentMMKV(@NonNull IContent tabContent) {
        return getContentMMKV(tabContent.id());
    }

    @NonNull
    default IMMKV getTabToolMMKV(@NonNull ITabTool tabTool) {
        return getTabToolMMKV(tabTool.id());
    }

    @NonNull
    default IMMKV getExplorerMMKV(@NonNull IExplorer explorer) {
        return getExplorerMMKV(explorer.id());
    }

}
