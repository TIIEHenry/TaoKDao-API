package androcode.api.plugin;

import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;
import java.util.List;

import androcode.api.plugin.loader.IPluginLoader;

//install uninstall  file manage
public interface IPluginManager {
    IPluginLoader getPluginLoader();


    /**
     * 发起安装插件的请求
     *
     * @param intent Intent
     */
    boolean requestInstallFromIntent(Intent intent);

    /**
     * 发起安装插件的请求
     *
     * @param file 插件文件路径
     */
    boolean requestInstallFromFile(File file);

    /**
     * 发起卸载插件的请求
     *
     * @param id 插件id
     */
    void requestUninstall(String id);


    /**
     * 获取plugin支持的tabcontent列表，方便一键运行
     *
     * @param id tabcontent id
     * @return list
     */
    List<Plugin> getPluginListForTabContent(String id);

    /**
     * @param id 插件id
     * @return 插件所在文件夹
     */
    @Nullable
    default File getPluginDir(String id) {
        for (Plugin plugin : getInstalledPluginList()) {
            if (plugin.id.equals(id))
                return plugin.pluginDir;
        }
        return null;
    }

    /**
     * 安装插件
     *
     * @param plugin pluginLoader load的临时Plugin
     * @return 是否成功
     */
    boolean installPlugin(@NonNull Plugin plugin);

    /**
     * 卸载
     *
     * @param plugin 已经加载的Plugin
     * @return 是否成功
     */
    boolean uninstallPlugin(@NonNull Plugin plugin);

    /**
     * 卸载
     *
     * @param id 已经加载的Plugin id
     * @return 是否成功
     */
    default boolean uninstallPlugin(@NonNull String id) {
        Plugin plugin = getInstalledPlugin(id);
        if (plugin != null) {
            return uninstallPlugin(plugin);
        }
        return false;
    }

    /**
     * 重新加载已经安装的插件Manifest
     */
    void reloadPluginManifestList();

    /**
     * 重新加载已经安装的插件，过程中初始化InstalledPluginList
     */
    void reloadInstalledPlugin();

    /**
     * 对所有plugin执行onLoad方法
     */
    void loadInstalledPlugin();

    /**
     * 对所有plugin执行onInit方法
     */
    void initInstalledPlugin();

    /**
     * 对所有非engine plugin执行onDestroy方法
     */
    void destroyInstalledPlugin();

    /**
     * 对所有pluginEngine执行onLoad方法
     */
    void loadInstalledPluginEnginePlugin();

    /**
     * 对所有pluginEngine执行onInit方法
     */
    void initInstalledPluginEnginePlugin();

    /**
     * 对所有pluginEngine执行onDestroy方法
     */
    void destroyInstalledPluginEnginePlugin();


    @NonNull
    List<Plugin> getInstalledPluginList();

    /**
     * 获取已安装的Plugin
     *
     * @param id plugin id
     * @return plugin
     */
    @Nullable
    default Plugin getInstalledPlugin(@NonNull String id) {
        for (Plugin plugin : getInstalledPluginList()) {
            if (plugin.id.equals(id))
                return plugin;
        }
        return null;
    }

}
