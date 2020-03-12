package androcode.api.main;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;
import java.io.FileNotFoundException;

import dalvik.system.DexClassLoader;

public interface IDexLoader {

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
    DexClassLoader loadDex(String path) throws FileNotFoundException;

    @Nullable
    DexClassLoader loadDexFile(File dexFile) throws FileNotFoundException;

    @Nullable
    Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException;
}