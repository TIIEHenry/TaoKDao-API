package androcode.api.plugin.engine.wrapped;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androcode.api.bean.Properties;
import androcode.api.plugin.engine.IPluginEngine;

public abstract class PluginEngine implements IPluginEngine {
    private final String id;
    private final String label;
    private final String des;

    public PluginEngine(@NonNull Properties properties) {
        this.id = properties.id;
        this.label = properties.label;
        this.des = properties.des;
    }

    @NonNull
    @Override
    public String id() {
        return id;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Nullable
    @Override
    public String getDescription() {
        return des;
    }
}
