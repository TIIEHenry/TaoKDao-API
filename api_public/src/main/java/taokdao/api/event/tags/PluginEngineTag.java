package taokdao.api.event.tags;

import androidx.annotation.NonNull;

import taokdao.api.api_public.R;
import taokdao.api.event.tag.IEventTag;
import taokdao.api.main.IMainContext;
import taokdao.api.plugin.engine.IPluginEngine;


public class PluginEngineTag implements IEventTag {
    private final IPluginEngine pluginEngine;

    public PluginEngineTag(@NonNull IPluginEngine pluginEngine) {
        this.pluginEngine = pluginEngine;
    }

    @NonNull
    @Override
    public String getTag(@NonNull IMainContext main) {
        return main.getString(R.string.event_plugin_engine_prefix) + "(" + pluginEngine.getLabel() + ")";
    }
}