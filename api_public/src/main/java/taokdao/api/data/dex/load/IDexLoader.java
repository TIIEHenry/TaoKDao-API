package taokdao.api.data.dex.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;
import java.io.FileNotFoundException;

import dalvik.system.DexClassLoader;

public interface IDexLoader {
//    void setClassLoader(DexClassLoader classLoader);

    @NonNull
    ClassLoader getClassLoader();

    /**
     * @return odex路径
     */
    @NonNull
    String getOptimizedDirectory();

    /**
     * @return lib路径
     */
    @NonNull
    String getLibrarySearchPath();

    /**
     * 加载已安装的其他app的dex
     *
     * @param packageName 报名
     */

    @Nullable
    DexClassLoader loadInstalledApkDex(@NonNull String packageName);

    @Nullable
    DexClassLoader loadApk(@NonNull File apkFile);

    @Nullable
    DexClassLoader loadDex(@NonNull String path) throws FileNotFoundException;

    @Nullable
    DexClassLoader loadDexFile(@NonNull File dexFile) throws FileNotFoundException;

    @Nullable
    Class<?> loadClass(@NonNull String name, boolean resolve) throws ClassNotFoundException;
}