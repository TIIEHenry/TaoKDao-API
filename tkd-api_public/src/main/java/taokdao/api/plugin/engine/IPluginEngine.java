package taokdao.api.plugin.engine;

import androidx.annotation.NonNull;

import taokdao.api.data.bean.IProperties;
import taokdao.api.plugin.bean.Plugin;

public interface IPluginEngine extends IProperties {

    void onCreateEngine();

    void onDestroyEngine();

//    void onLoadModule();

    /**
     * before installed
     * @param plugin
     */
    void onInstallPlugin(@NonNull Plugin plugin);

    /**
     * before uninstalled
     * @param plugin
     */
    void onUninstallPlugin(@NonNull Plugin plugin);

    /**
     * 新的插件在Install的时候，旧插件会调用
     *
     * @param plugin 旧插件
     */
    void onUpdatePlugin(@NonNull Plugin plugin);

    void onLoadPlugin(@NonNull Plugin plugin);

    void onInitPlugin(@NonNull Plugin plugin);

    void onCallPlugin(@NonNull Plugin plugin);

    void onDestroyPlugin(@NonNull Plugin plugin);
}
