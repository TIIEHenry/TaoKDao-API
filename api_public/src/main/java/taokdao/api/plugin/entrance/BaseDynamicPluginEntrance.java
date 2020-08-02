package taokdao.api.plugin.entrance;

import android.content.Context;

import androidx.annotation.NonNull;

import taokdao.api.main.IMainContext;
import taokdao.api.plugin.bean.PluginManifest;

public class BaseDynamicPluginEntrance implements IDynamicPluginEntrance {
    @Override
    public void onAttach(@NonNull Context pluginContext) {

    }

    @Override
    public void onUpGrade(@NonNull IMainContext main, PluginManifest manifest) {

    }

    @Override
    public void onDownGrade(@NonNull IMainContext main, PluginManifest manifest) {

    }

    @Override
    public void onCreate(@NonNull IMainContext main, PluginManifest manifest) {

    }

    @Override
    public void onInit(@NonNull IMainContext main, PluginManifest manifest) {

    }

    @Override
    public void onCall(@NonNull IMainContext main, PluginManifest manifest) {

    }

    @Override
    public void onResume(@NonNull IMainContext main, PluginManifest manifest) {

    }

    @Override
    public void onPause(@NonNull IMainContext main, PluginManifest manifest) {

    }

    @Override
    public void onDestroy(@NonNull IMainContext main, PluginManifest manifest) {

    }
}
