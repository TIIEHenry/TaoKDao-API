package androcode.api.project.plugin;

import androcode.base.identifiable.IdentifiablePool;

public class ProjectPluginPool extends IdentifiablePool<IProjectPlugin, String> {
    private static ProjectPluginPool instance = new ProjectPluginPool();

    public static ProjectPluginPool getInstance() {
        return instance;
    }

    public static ProjectPluginPool newInstance() {
        instance = new ProjectPluginPool();
        return instance;
    }
}

