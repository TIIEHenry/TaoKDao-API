package androcode.api.plugin;

import java.io.File;

public interface IPluginLoader {

    void loadPluginList();

    void initPluginModules();

    void initPluginModule(String id);

    void runPluginModule(String id);

    PluginInfo getPluginInfo(String id);

    PluginInfo getPluginInfoFromFile(File infoFile);

    PluginInfo getPluginInfoFromDir(File dir);

    PluginInfo getPluginInfoFromAPK(File apk);

    PluginInfo getPluginInfoFromZIP(File zip);
}
