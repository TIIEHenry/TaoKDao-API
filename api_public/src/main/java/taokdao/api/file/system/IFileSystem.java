package taokdao.api.file.system;

import androidx.annotation.NonNull;

import java.io.File;

import taokdao.api.plugin.bean.PluginManifest;

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
    File getProjectDir();

    /**
     * @return 崩溃日志目录
     */
    @NonNull
    File getCrashDir();

    /**
     * @return 配置目录
     */
    @NonNull
    File getConfigDir();

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
    File getPluginDir();

    /**
     * @return 所有插件工作目录
     */
    @NonNull
    File getPluginWorkDir();

    /**
     * @return 所有插件缓存目录
     */
    @NonNull
    File getPluginCacheDir();

    /**
     * @param plugin 插件
     * @return 安装目录
     */
    @NonNull
    File getPluginDir(@NonNull PluginManifest plugin);

    /**
     * @param plugin 插件
     * @return 工作目录
     */
    @NonNull
    File getPluginWorkDir(@NonNull PluginManifest plugin);

    /**
     * @param plugin 插件
     * @return 缓存目录
     */
    @NonNull
    File getPluginCacheDir(@NonNull PluginManifest plugin);
}
