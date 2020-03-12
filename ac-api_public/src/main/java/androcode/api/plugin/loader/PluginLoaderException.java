package androcode.api.plugin.loader;

public class PluginLoaderException extends Exception {

    public PluginLoaderException(PluginManifest config, String message) {
        super("LoadPlugin(manifest:" + config.manifestFile + ")Failed{" + message + "}");
    }
}
