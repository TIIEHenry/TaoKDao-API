package taokdao.api.event.send.wrapped;

import androidx.annotation.NonNull;

import taokdao.api.event.send.IEventSender;
import taokdao.api.event.tag.IEventTag;
import taokdao.api.main.IMainContext;

public class EventSender implements IEventSender {
    private final IEventTag eventTag;
    private String message;
    private int messageId;

    public EventSender(@NonNull IEventTag eventTag, @NonNull String message) {
        this.eventTag = eventTag;
        this.message = message;
    }


    public EventSender(@NonNull IEventTag eventTag, int messageId) {
        this.eventTag = eventTag;
        this.messageId = messageId;
    }

    @Override
    public void log(@NonNull IMainContext main) {
        if (message != null)
            main.log(eventTag, message);
        else
            main.log(eventTag, messageId);
    }

    @Override
    public void notify(@NonNull IMainContext main) {
        if (message != null)
            main.notify(eventTag, message);
        else
            main.notify(eventTag, messageId);
    }

    @Override
    public void send(@NonNull IMainContext main) {
        if (message != null)
            main.send(eventTag, message);
        else
            main.send(eventTag, messageId);
    }

}
