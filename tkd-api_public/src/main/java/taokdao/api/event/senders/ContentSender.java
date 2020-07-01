package taokdao.api.event.senders;

import androidx.annotation.NonNull;

import taokdao.api.event.send.IEventSender;
import taokdao.api.event.send.wrapped.EventSender;
import taokdao.api.event.tags.ContentTag;
import taokdao.api.ui.content.IContent;
import taokdao.base.annotation.impl.InternalImpl;


@InternalImpl
public class ContentSender {
    private IContent content;

    public ContentSender(@NonNull IContent content) {
        this.content = content;
    }

    public static IEventSender messageGlobal(@NonNull String message) {
        return new EventSender(ContentTag.getGlobal(), /*"Message: " +*/ message);
    }

    public static IEventSender fileOpened(@NonNull String message, String path) {
        return new EventSender(ContentTag.getGlobal(), message + ": " + path);
    }

    public IEventSender saveSuccess(@NonNull String path) {
        return new EventSender(new ContentTag(content), path + ": saved");
    }

    public IEventSender openFailed(@NonNull String path) {
        return new EventSender(new ContentTag(content), path + ": openFailed");
    }

    public IEventSender saveFailed(@NonNull String path) {
        return new EventSender(new ContentTag(content), path + ": saveFailed");
    }

    public IEventSender exception(@NonNull Exception exception) {
        return new EventSender(new ContentTag(content), "Exception: " + exception.getMessage());
    }

    public IEventSender message(@NonNull String message) {
        return new EventSender(new ContentTag(content), /*"Message: " +*/ message);
    }

//    public IEventSender open(@NonNull String path) {
//        return main -> main.send(new TabContentTag(tabContent), path + ": saved");
//    }

}