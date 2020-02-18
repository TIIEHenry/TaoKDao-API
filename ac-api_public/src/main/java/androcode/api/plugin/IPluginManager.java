package androcode.api.plugin;

import android.content.Intent;

import java.io.File;

//install uninstall  file manage
public interface IPluginManager {
    IPluginLoader getPluginLoader();

    void reloadPlugin();

    boolean requestInstallFromIntent(Intent intent);

    boolean requestInstallFromFile(File file);

    void requestUninstall(String id);

    File getPluginModuleDirFile(String id);

    File getPluginModuleInitFile(String id);

    File getPluginModuleInfoFile(String id);
}
