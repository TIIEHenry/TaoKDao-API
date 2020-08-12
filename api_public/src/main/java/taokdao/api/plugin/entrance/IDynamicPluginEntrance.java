package taokdao.api.plugin.entrance;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;

import taokdao.api.main.IMainContext;
import taokdao.api.plugin.bean.PluginManifest;
import taokdao.api.plugin.bridge.invoke.IInvokeCallback;

/**
 * java实现的plugin需要实现该接口
 */
public interface IDynamicPluginEntrance {
    /**
     * @param pluginContext context of plugin
     */
    void onAttach(@NonNull Context pluginContext);

    void onUpGrade(@NonNull IMainContext main, @NonNull PluginManifest manifest);

    void onDownGrade(@NonNull IMainContext main, @NonNull PluginManifest manifest);

    void onCreate(@NonNull IMainContext main, @NonNull PluginManifest manifest);

    void onInit(@NonNull IMainContext main, @NonNull PluginManifest manifest);

    @UiThread
    void onCall(@NonNull IMainContext main, @NonNull PluginManifest manifest);

    void onResume(@NonNull IMainContext main, @NonNull PluginManifest manifest);

    void onPause(@NonNull IMainContext main, @NonNull PluginManifest manifest);

    void onDestroy(@NonNull IMainContext main, @NonNull PluginManifest manifest);

    @Nullable
    String onInvoke(@NonNull IMainContext main, @NonNull PluginManifest manifest, @NonNull String method, @Nullable String params, @Nullable IInvokeCallback invokeCallback);
}
