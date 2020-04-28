package taokdao.api.plugin.loader;

import taokdao.api.plugin.bean.PluginManifest;

public class PluginLoaderException extends Exception {

    public PluginLoaderException(PluginManifest config, String message) {
        super("LoadPlugin(manifest:" + config.manifestFile + ")Failed{" + message + "}");
    }
}
