package taokdao.api.event.senders;

import androidx.annotation.Nullable;

import taokdao.api.event.send.IEventSender;
import taokdao.api.event.send.wrapped.EventSender;
import taokdao.api.event.tags.PluginInstallerTag;
import taokdao.api.event.tags.PluginLoaderTag;

public class PluginInstallerSender {

    public static IEventSender loadManifestError(@Nullable String message) {
        return new EventSender(new PluginInstallerTag(), "loadManifestError:" + message);
    }
    public static IEventSender loadPluginError(@Nullable String message) {
        return new EventSender(new PluginInstallerTag(), "loadPluginError:" + message);
    }
}
