package androcode.api.plugin.loader;

import androidx.annotation.NonNull;

import java.io.File;

import androcode.api.plugin.Plugin;

/**
 * 负责加载插件
 */
public interface IPluginLoader {

    default File getPluginManifestFile(File projectDirFile) {
        return new File(projectDirFile, PluginManifest.manifestFileName);
    }

    @NonNull
    PluginManifest loadPluginManifestFromZIP(@NonNull File zipFile) throws PluginLoaderException;

    @NonNull
    PluginManifest loadPluginManifestFromAPK(@NonNull File apkFile) throws PluginLoaderException;

    @NonNull
    default PluginManifest loadPluginManifestFromDir(@NonNull File pluginDir) throws PluginLoaderException {
        return loadPluginManifestFromFile(getPluginManifestFile(pluginDir));
    }

    @NonNull
    PluginManifest loadPluginManifestFromFile(@NonNull File manifestFile) throws PluginLoaderException;

    @NonNull
    Plugin loadPlugin(@NonNull PluginManifest pluginManifest) throws PluginLoaderException;
}
