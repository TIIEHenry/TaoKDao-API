package taokdao.api.plugin.load;

import taokdao.api.plugin.bean.PluginManifest;

public class PluginLoadException extends Exception {

    public PluginLoadException(PluginManifest config, String message) {
        super("LoadPluginFailed{label:" + config.information.label + ",id:" + config.id + ",message:" + message + "}");
    }
}
