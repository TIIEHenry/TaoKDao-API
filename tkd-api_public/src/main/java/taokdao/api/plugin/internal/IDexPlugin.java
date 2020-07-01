package taokdao.api.plugin.internal;

import androidx.annotation.NonNull;
import androidx.annotation.UiThread;

import taokdao.api.main.IMainActivity;
import taokdao.api.plugin.bean.PluginManifest;

/**
 * java实现的plugin需要实现该接口
 */
public interface IDexPlugin {

    void onUpGrade(@NonNull IMainActivity main, PluginManifest manifest);

    void onDownGrade(@NonNull IMainActivity main, PluginManifest manifest);

    void onCreate(@NonNull IMainActivity main, PluginManifest manifest);

    void onInit(@NonNull IMainActivity main, PluginManifest manifest);

    @UiThread
    void onCall(@NonNull IMainActivity main, PluginManifest manifest);

    void onResume(@NonNull IMainActivity main, PluginManifest manifest);

    void onPause(@NonNull IMainActivity main, PluginManifest manifest);

    void onDestroy(@NonNull IMainActivity main, PluginManifest manifest);


}
