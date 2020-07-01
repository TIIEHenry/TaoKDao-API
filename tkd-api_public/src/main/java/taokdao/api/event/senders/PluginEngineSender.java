package taokdao.api.event.senders;

import androidx.annotation.NonNull;

import taokdao.api.event.send.IEventSender;
import taokdao.api.event.send.wrapped.EventSender;
import taokdao.api.event.tags.PluginEngineTag;
import taokdao.api.plugin.bean.Plugin;
import taokdao.api.plugin.engine.IPluginEngine;

public class PluginEngineSender {
    private final IPluginEngine pluginEngine;

    public PluginEngineSender(@NonNull IPluginEngine pluginEngine) {
        this.pluginEngine = pluginEngine;
    }


    /**
     * Plugin入口错误
     *
     * @param plugin
     * @param entrance
     * @return
     */
    public IEventSender entranceIncorrect(@NonNull Plugin plugin, @NonNull String entrance) {
        return new EventSender(new PluginEngineTag(pluginEngine), "[pluginId:" + plugin.id + "] " + "entrance incorrect: " + entrance);
    }

    public IEventSender pluginError(@NonNull Plugin plugin, @NonNull String msg) {
        return new EventSender(new PluginEngineTag(pluginEngine), "[pluginId:" + plugin.id + "] " + msg);
    }


    public IEventSender errorMsg(@NonNull String message) {
        return new EventSender(new PluginEngineTag(pluginEngine), "Message: " + message);
    }


//    public IEventSender open(@NonNull String path) {
//        return main -> main.send(new TabContentTag(tabContent), path + ": saved");
//    }

}