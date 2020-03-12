package androcode.api.plugin.engine;

import androidx.annotation.NonNull;

public abstract class PluginEngine implements IPluginEngine {
    private final String id;
    private final String name;

    public PluginEngine(@NonNull String id, @NonNull String name) {
        this.id = id;
        this.name = name;
    }

    @NonNull
    @Override
    public String id() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }
}
