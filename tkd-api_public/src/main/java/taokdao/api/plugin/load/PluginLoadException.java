package taokdao.api.plugin.load;

import taokdao.api.plugin.bean.PluginManifest;

public class PluginLoadException extends Exception {

    public PluginLoadException(PluginManifest config, String message) {
        super("LoadPluginFailed{manifest:" + config.manifestFile + ",message:" + message + "}");
    }
}
