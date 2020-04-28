package taokdao.api.file.system;

import androidx.annotation.NonNull;

import java.io.File;

import taokdao.api.plugin.bean.Plugin;

/**
 * work 工作目录
 * cache 缓存目录
 * internal data/data
 * external Android/data
 */
public interface IFileSystem {
    /**
     * MMKV root dir
     *
     * @return
     */
    @NonNull
    File getSettingDir();

    @NonNull
    default File getProjectDir() {
        File file = new File(getWorkDir(), "Project");
        file.mkdirs();
        return file;
    }

    /**
     * @return 崩溃日志目录
     */
    @NonNull
    default File getCrashDir() {
        File file = new File(getWorkDir(), "Crash");
        file.mkdirs();
        return file;
    }

    @NonNull
    File getInternalWorkDir();

    @NonNull
    File getWorkDir();

    @NonNull
    File getExternalWorkDir();


    @NonNull
    File getInternalCacheDir();

    @NonNull
    File getCacheDir();

    @NonNull
    File getExternalCacheDir();

    /**
     * @return 所有插件安装目录
     */
    @NonNull
    default File getPluginDir() {
        File file = new File(getWorkDir(), "Plugin");
        file.mkdirs();
        return file;
    }

    /**
     * @return 所有插件工作目录
     */
    @NonNull
    default File getPluginWorkDir() {
        File file = new File(getExternalWorkDir(), "Plugin");
        file.mkdirs();
        return file;
    }

    /**
     * @return 所有插件缓存目录
     */
    @NonNull
    default File getPluginCacheDir() {
        File file = new File(getExternalWorkDir(), "cache");
        file.mkdirs();
        return file;
    }

    /**
     * @param plugin 插件
     * @return 安装目录
     */
    @NonNull
    default File getPluginDir(@NonNull Plugin plugin) {
        File file = new File(getPluginDir(), plugin.id);
        file.mkdirs();
        return file;
    }

    /**
     * @param plugin 插件
     * @return 工作目录
     */
    @NonNull
    default File getPluginWorkDir(@NonNull Plugin plugin) {
        File file = new File(getPluginWorkDir(), plugin.id);
        file.mkdirs();
        return file;
    }

    /**
     * @param plugin 插件
     * @return 缓存目录
     */
    @NonNull
    default File getPluginCacheDir(@NonNull Plugin plugin) {
        File file = new File(getPluginCacheDir(), plugin.id);
        file.mkdirs();
        return file;
    }

}
