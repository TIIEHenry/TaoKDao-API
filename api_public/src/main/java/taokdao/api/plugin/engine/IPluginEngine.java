package taokdao.api.plugin.engine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import taokdao.api.data.bean.IProperties;
import taokdao.api.plugin.bean.Plugin;
import taokdao.api.plugin.bean.PluginActions;
import taokdao.api.plugin.bridge.invoke.IInvokeCallback;

public interface IPluginEngine extends IProperties {

    void onCreateEngine();

    void onDestroyEngine();

    void onInstallPlugin(@NonNull Plugin plugin);

    void onUninstallPlugin(@NonNull Plugin plugin);


//    void onLoadModule();

    void callPluginAction(@NonNull Plugin plugin, @NonNull PluginActions action);

    @Nullable
    String invokePlugin(@NonNull Plugin plugin, @NonNull String method, @Nullable String params, @Nullable IInvokeCallback invokeCallback);
}
