package taokdao.api.plugin.engine.wrapped;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import taokdao.api.data.bean.IProperties;
import taokdao.api.plugin.engine.IPluginEngine;

public abstract class PluginEngine implements IPluginEngine {
    private final String id;
    private final String label;
    private final String des;

    public PluginEngine(@NonNull IProperties properties) {
        this.id = properties.id();
        this.label = properties.getLabel();
        this.des = properties.getDescription();
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
