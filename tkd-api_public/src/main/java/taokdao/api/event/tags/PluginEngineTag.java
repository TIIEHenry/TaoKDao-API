package taokdao.api.event.tags;

import androidx.annotation.NonNull;

import taokdao.api.event.tag.IEventTag;
import taokdao.api.main.IMainActivity;
import taokdao.api.plugin.engine.IPluginEngine;
import tiiehenry.taokdao.api.main.R;


public class PluginEngineTag implements IEventTag {
    private final IPluginEngine pluginEngine;

    public PluginEngineTag(@NonNull IPluginEngine pluginEngine) {
        this.pluginEngine = pluginEngine;
    }

    @NonNull
    @Override
    public String getTag(@NonNull IMainActivity main) {
        return main.getString(R.string.event_plugin_engine_prefix) + "(" + pluginEngine.getLabel() + ")";
    }
}