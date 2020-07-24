package taokdao.api.project.plugin;

import taokdao.base.identifiable.IdentifiablePool;

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

