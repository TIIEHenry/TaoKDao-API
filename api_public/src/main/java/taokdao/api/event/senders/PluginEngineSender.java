package taokdao.api.event.senders;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import taokdao.api.event.send.IEventSender;
import taokdao.api.event.send.wrapped.EventSender;
import taokdao.api.event.tags.PluginEngineTag;
import taokdao.api.main.IMainContext;
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


    public IEventSender callError(@NonNull Plugin plugin, @NonNull Throwable e, IMainContext main) {
        return new EventSender(new PluginEngineTag(pluginEngine), "Plugin:" + plugin.getInformation(main).label + "\n" + "Message: " + e.getMessage());
    }


    public IEventSender engineError(@Nullable String message) {
        return new EventSender(new PluginEngineTag(pluginEngine), "Error: " + message);
    }


//    public IEventSender open(@NonNull String path) {
//        return main -> main.send(new TabContentTag(tabContent), path + ": saved");
//    }

}