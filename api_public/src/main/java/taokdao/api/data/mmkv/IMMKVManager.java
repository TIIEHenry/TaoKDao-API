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

    IMMKV getProjectPluginMMKV(@NonNull String id);

    @NonNull
    IMMKV getPluginMMKV(@NonNull String id);

    @NonNull
    IMMKV getPluginEngineMMKV(@NonNull String id);

    @NonNull
    IMMKV getContentMMKV(@NonNull String id);

    @NonNull
    IMMKV getTabToolMMKV(@NonNull String id);

    @NonNull
    IMMKV getExplorerMMKV(@NonNull String id);

    IMMKV getProjectPluginMMKV(@NonNull IProjectPlugin projectPlugin);

    @NonNull
    IMMKV getPluginEngineMMKV(@NonNull IPluginEngine pluginEngine);

    @NonNull
    IMMKV getPluginMMKV(@NonNull PluginManifest pluginManifest);

    @NonNull
    IMMKV getPluginMMKV(@NonNull Plugin plugin);

    @NonNull
    IMMKV getContentMMKV(@NonNull IContent tabContent);

    @NonNull
    IMMKV getTabToolMMKV(@NonNull ITabTool tabTool);

    @NonNull
    IMMKV getExplorerMMKV(@NonNull IExplorer explorer);
}
