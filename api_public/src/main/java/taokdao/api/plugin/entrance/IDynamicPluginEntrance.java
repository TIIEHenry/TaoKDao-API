package taokdao.api.plugin.entrance;

import android.content.res.AssetManager;
import android.content.res.Resources;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;

import taokdao.api.main.IMainContext;
import taokdao.api.plugin.bean.PluginManifest;

/**
 * java实现的plugin需要实现该接口
 */
public interface IDynamicPluginEntrance {
    void onDynamicLoaded(@NonNull ClassLoader classLoader, @Nullable AssetManager assetManager, @Nullable Resources resources);

    void onUpGrade(@NonNull IMainContext main, PluginManifest manifest);

    void onDownGrade(@NonNull IMainContext main, PluginManifest manifest);

    void onCreate(@NonNull IMainContext main, PluginManifest manifest);

    void onInit(@NonNull IMainContext main, PluginManifest manifest);

    @UiThread
    void onCall(@NonNull IMainContext main, PluginManifest manifest);

    void onResume(@NonNull IMainContext main, PluginManifest manifest);

    void onPause(@NonNull IMainContext main, PluginManifest manifest);

    void onDestroy(@NonNull IMainContext main, PluginManifest manifest);


}
