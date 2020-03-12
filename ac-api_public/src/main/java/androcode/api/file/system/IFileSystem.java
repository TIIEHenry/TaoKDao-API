package androcode.api.file.system;

import androidx.annotation.NonNull;

import java.io.File;

import androcode.api.plugin.Plugin;

public interface IFileSystem {
    @NonNull
    File getWorkDir();

    /**
     * data/data
     *
     * @return
     */
    @NonNull
    File getInternalWorkDir();


    /**
     * Android/data
     *
     * @return
     */
    @NonNull
    File getExternalWorkDir();

    @NonNull
    File getCacheDir();

    /**
     * data/data
     *
     * @return
     */
    @NonNull
    File getInternalCacheDir();

    /**
     * Android/data
     *
     * @return
     */
    @NonNull
    File getExternalCacheDir();

    @NonNull
    default File getPluginDir() {
        return new File(getWorkDir(), "Plugin");
    }

    @NonNull
    default File getCrashDir() {
        return new File(getWorkDir(), "Crash");
    }

    @NonNull
    default File getProjectDir() {
        return new File(getWorkDir(), "Project");
    }

    @NonNull
    default File getPluginWorkDir() {
        return new File(getExternalWorkDir(), "Plugin");
    }

    @NonNull
    default File getPluginCacheDir() {
        return new File(getExternalWorkDir(), "cache");
    }

    @NonNull
    default File getPluginWorkDir(@NonNull Plugin plugin) {
        return new File(getPluginWorkDir(), plugin.id);
    }

    @NonNull
    default File getPluginCacheDir(@NonNull Plugin plugin) {
        return new File(getPluginCacheDir(), plugin.id);
    }

}
