package androcode.api.plugin;

import android.content.Intent;

import java.io.File;

//install unistall  file manage
public interface IPluginManager {
    IPluginLoader getPluginLoader();

    void reinitPlugin();

    boolean requestInstallFromIntent(Intent intent);

    boolean requestInstallFromFile(File file);

    void requestUnistall(String id);

    File getPluginModuleDirFile(String id);

    File getPluginModuleInitFile(String id);

    File getPluginModuleInfoFile(String id);
}
