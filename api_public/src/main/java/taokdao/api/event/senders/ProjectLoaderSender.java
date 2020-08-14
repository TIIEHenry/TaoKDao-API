package taokdao.api.event.senders;

import androidx.annotation.Nullable;

import taokdao.api.event.send.IEventSender;
import taokdao.api.event.send.wrapped.EventSender;
import taokdao.api.event.tags.ProjectLoaderTag;


public class ProjectLoaderSender {

    public static IEventSender loadConfigError(@Nullable String message) {
        return new EventSender(new ProjectLoaderTag(), "loadConfigError:" + message);
    }
}