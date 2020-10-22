package taokdao.api.plugin.load;

import android.util.Log;

import taokdao.api.plugin.bean.PluginManifest;

public class PluginLoadException extends Exception {

    public PluginLoadException(PluginManifest config, String message, String languageCountry) {
        super("LoadPluginFailed{label:" + config.getInformation(languageCountry).label + ",id:" + config.id + ",message:" + message + "}");
    }
}
