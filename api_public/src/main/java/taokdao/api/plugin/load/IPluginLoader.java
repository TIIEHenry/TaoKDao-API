package taokdao.api.plugin.load;

import androidx.annotation.NonNull;

import java.io.File;

import taokdao.api.plugin.bean.Plugin;
import taokdao.api.plugin.bean.PluginManifest;

/**
 * 负责加载插件
 */
public interface IPluginLoader {

    default File getPluginManifestFile(File projectDirFile) {
        return new File(projectDirFile, PluginManifest.manifestFileName);
    }

    @NonNull
    PluginManifest loadPluginManifestFromZIP(@NonNull File zipFile) throws PluginLoadException;

    @NonNull
    PluginManifest loadPluginManifestFromAPK(@NonNull File apkFile) throws PluginLoadException;

    @NonNull
    default PluginManifest loadPluginManifestFromDir(@NonNull File pluginDir) throws PluginLoadException {
        return loadPluginManifestFromFile(getPluginManifestFile(pluginDir));
    }

    @NonNull
    PluginManifest loadPluginManifestFromFile(@NonNull File manifestFile) throws PluginLoadException;

    @NonNull
    Plugin loadPlugin(@NonNull PluginManifest pluginManifest) throws PluginLoadException;
}
