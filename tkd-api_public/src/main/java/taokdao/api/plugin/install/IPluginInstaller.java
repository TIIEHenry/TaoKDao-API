package taokdao.api.plugin.install;

import android.content.Intent;

import androidx.annotation.NonNull;

import java.io.File;
import java.io.IOException;

import taokdao.api.plugin.bean.Plugin;
import taokdao.base.annotation.thread.BlockUI;

public interface IPluginInstaller {

    boolean requestInstallFromIntent(@NonNull Intent intent);

    boolean requestInstallFromFile(@NonNull File file);

    boolean requestUninstall(@NonNull String id);

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


}
