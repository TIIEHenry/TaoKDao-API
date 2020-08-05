package taokdao.api.plugin.manage;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import taokdao.api.plugin.bean.Plugin;
import taokdao.api.plugin.bean.PluginType;

//install uninstall  file manage
public interface IPluginManager {

    /**
     * 显示插件启动器
     */
    void showPluginLauncher();

    /**
     * 重新加载已经安装的插件Manifest
     */
    void reloadPluginManifestList();


    /**
     * 重新加载已经安装的插件清单
     */
    void reloadPluginList(@NonNull PluginType type);


    /**
     * 对指定类型plugin执行onCreate方法
     */
    void callPluginOnCreate(@NonNull PluginType type);

    /**
     * 对指定类型plugin执行onInit方法
     */
    void callPluginOnInit(@NonNull PluginType type);

    /**
     * 对指定类型plugin执行onDestroy方法
     */
    void callPluginOnDestroy(@NonNull PluginType type);

    /**
     * 对指定类型plugin执行onPause
     */
    void callPluginOnPause(@NonNull PluginType type);

    /**
     * 对指定类型plugin执行onResume
     */
    void callPluginOnResume(@NonNull PluginType type);


    void loadPluginList(@NonNull PluginType type);

    void unloadPluginList(@NonNull PluginType type);

    /**
     * 获取指定类型的plugin列表
     *
     * @param type 类型
     * @return list
     */
    @NonNull
    default List<Plugin> getPluginList(@NonNull PluginType type) {
        ArrayList<Plugin> list = new ArrayList<>();
        for (Plugin plugin : getPluginList()) {
            if (plugin.type == type)
                list.add(plugin);
        }
        return list;
    }

    /**
     * 获取plugin列表
     *
     * @return list
     */
    @NonNull
    List<Plugin> getPluginList();


    /**
     * 获取已安装的Plugin
     *
     * @param id plugin id
     * @return plugin
     */
    @Nullable
    default Plugin getPlugin(@NonNull String id) {
        for (Plugin plugin : getPluginList()) {
            if (plugin.id.equals(id))
                return plugin;
        }
        return null;
    }


    /**
     * 禁用插件
     *
     * @param plugin 已经安装的Plugin
     */
    void disablePlugin(@NonNull Plugin plugin);

    /**
     * 启用插件
     *
     * @param plugin 已经安装的Plugin
     */
    void enablePlugin(@NonNull Plugin plugin);

    /**
     * @param plugin plugin 已经安装的Plugin
     * @return 是否启用
     */
    boolean isPluginEnabled(@NonNull Plugin plugin);

    Drawable loadPluginIcon(@NonNull Plugin plugin);

}
