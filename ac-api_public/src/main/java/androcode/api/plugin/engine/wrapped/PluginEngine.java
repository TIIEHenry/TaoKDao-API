package androcode.api.plugin.engine.wrapped;

import androidx.annotation.NonNull;

import androcode.api.plugin.engine.IPluginEngine;

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
