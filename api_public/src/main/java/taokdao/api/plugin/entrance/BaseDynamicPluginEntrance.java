package taokdao.api.plugin.entrance;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import taokdao.api.main.IMainContext;
import taokdao.api.plugin.bean.PluginManifest;
import taokdao.api.plugin.bridge.invoke.IInvokeCallback;

public class BaseDynamicPluginEntrance implements IDynamicPluginEntrance {
    public Context pluginContext;

    @Override
    public void onAttach(@NonNull Context pluginContext) {
        this.pluginContext = pluginContext;
    }

    @Override
    public void onUpGrade(@NonNull IMainContext main, @NonNull PluginManifest manifest) {

    }

    @Override
    public void onDownGrade(@NonNull IMainContext main, @NonNull PluginManifest manifest) {

    }

    @Override
    public void onCreate(@NonNull IMainContext main, @NonNull PluginManifest manifest) {

    }

    @Override
    public void onInit(@NonNull IMainContext main, @NonNull PluginManifest manifest) {

    }

    @Override
    public void onCall(@NonNull IMainContext main, @NonNull PluginManifest manifest) {

    }

    @Override
    public void onResume(@NonNull IMainContext main, @NonNull PluginManifest manifest) {

    }

    @Override
    public void onPause(@NonNull IMainContext main, @NonNull PluginManifest manifest) {

    }

    @Override
    public void onDestroy(@NonNull IMainContext main, @NonNull PluginManifest manifest) {

    }

    @Override
    public String onInvoke(@NonNull IMainContext main, @NonNull PluginManifest manifest, @NonNull String method, @Nullable String params, @Nullable IInvokeCallback invokeCallback) {
        return null;
    }
}
