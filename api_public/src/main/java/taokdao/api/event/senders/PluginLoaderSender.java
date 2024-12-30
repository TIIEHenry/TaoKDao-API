package taokdao.api.event.senders;

import androidx.annotation.Nullable;

import taokdao.api.event.send.IEventSender;
import taokdao.api.event.send.wrapped.EventSender;
import taokdao.api.event.tags.PluginLoaderTag;

public class PluginLoaderSender {

    public IEventSender loadManifestError(@Nullable String message) {
        return new EventSender(new PluginLoaderTag(), "loadManifestError:" + message);
    }

    public IEventSender loadPluginError(@Nullable String message) {
        return new EventSender(new PluginLoaderTag(), "loadPluginError:" + message);
    }
}
