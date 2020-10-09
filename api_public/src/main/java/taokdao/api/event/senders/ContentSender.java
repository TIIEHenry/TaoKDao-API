package taokdao.api.event.senders;

import androidx.annotation.NonNull;

import java.nio.charset.Charset;

import taokdao.api.event.send.IEventSender;
import taokdao.api.event.send.wrapped.EventSender;
import taokdao.api.event.tags.ContentTag;
import taokdao.api.ui.content.IContent;
import taokdao.api.base.annotation.impl.InternalImpl;


@InternalImpl
public class ContentSender {
    private String id;

    public ContentSender(@NonNull IContent content) {
        this.id = content.id();
    }

    public static IEventSender messageGlobal(@NonNull String message) {
        return new EventSender(ContentTag.getGlobal(), /*"Message: " +*/ message);
    }

    public static IEventSender fileOpened(@NonNull String message, String path) {
        return new EventSender(ContentTag.getGlobal(), message + ": " + path);
    }


    public static IEventSender open(@NonNull String path) {
        return new EventSender(ContentTag.getGlobal(), path + ": open");
    }

    public static IEventSender close(@NonNull String path) {
        return new EventSender(ContentTag.getGlobal(), path + ": close");
    }

    public static IEventSender read(@NonNull String path, @NonNull Charset charset) {
        return new EventSender(ContentTag.getGlobal(), path + ": read in " + charset.displayName());
    }

    public static IEventSender write(@NonNull String path, @NonNull Charset charset) {
        return new EventSender(ContentTag.getGlobal(), path + ": read in " + charset.displayName());
    }

    public IEventSender saveSuccess(@NonNull String path) {
        return new EventSender(new ContentTag(id), path + ": saved");
    }


    public IEventSender openFailed(@NonNull String path) {
        return new EventSender(new ContentTag(id), path + ": openFailed");
    }

    public IEventSender saveFailed(@NonNull String path) {
        return new EventSender(new ContentTag(id), path + ": saveFailed");
    }

    public IEventSender exception(@NonNull Exception exception) {
        return new EventSender(new ContentTag(id), "Exception: " + exception.getMessage());
    }

    public IEventSender message(@NonNull String message) {
        return new EventSender(new ContentTag(id), /*"Message: " +*/ message);
    }

//    public IEventSender open(@NonNull String path) {
//        return main -> main.send(new TabContentTag(tabContent), path + ": saved");
//    }

}