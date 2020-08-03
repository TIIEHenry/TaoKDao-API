package taokdao.api.plugin.engine;

import taokdao.api.base.identifiable.IdentifiablePool;

public class PluginEnginePool extends IdentifiablePool<IPluginEngine, String> {
    private static PluginEnginePool instance = new PluginEnginePool();

    public static PluginEnginePool getInstance() {
        return instance;
    }

    public static PluginEnginePool newInstance() {
        instance = new PluginEnginePool();
        return instance;
    }
}
