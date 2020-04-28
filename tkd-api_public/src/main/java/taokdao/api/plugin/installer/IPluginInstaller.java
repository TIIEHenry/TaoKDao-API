package taokdao.api.plugin.installer;

import android.content.Intent;

import androidx.annotation.NonNull;

import java.io.File;
import java.io.IOException;

import taokdao.api.plugin.bean.Plugin;
import taokdao.base.annotation.thread.BlockUI;

public interface IPluginInstaller {

    @BlockUI
    void installPlugin(@NonNull Plugin plugin) throws IOException;

    /**
     * 卸载
     *
     * @param plugin 已经加载的Plugin
     * @return 是否成功
     */
    @BlockUI
    void uninstallPlugin(@NonNull Plugin plugin) throws IOException;


    /**
     * 发起安装插件的请求
     *
     * @param intent Intent
     * @return 是否接受处理
     */
    boolean requestInstallFromIntent(@NonNull Intent intent);

    /**
     * 发起安装插件的请求
     *
     * @param file 插件文件路径
     * @return 是否接受处理
     */
    boolean requestInstallFromFile(@NonNull File file);

    /**
     * 发起卸载插件的请求
     *
     * @param id 插件id
     * @return 是否接受处理
     */
    boolean requestUninstall(@NonNull String id);

    default boolean requestUninstall(@NonNull Plugin plugin) {
        return requestUninstall(plugin.id);
    }
}
