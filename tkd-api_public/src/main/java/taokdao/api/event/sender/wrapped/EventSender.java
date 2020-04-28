package taokdao.api.event.sender.wrapped;

import androidx.annotation.NonNull;

import taokdao.api.event.sender.IEventSender;
import taokdao.api.event.tag.IEventTag;
import taokdao.api.main.IMainActivity;

public class EventSender implements IEventSender {
    private final IEventTag eventTag;
    private final String message;

    public EventSender(@NonNull IEventTag eventTag, @NonNull String message) {
        this.eventTag = eventTag;
        this.message = message;
    }

    @Override
    public void log(@NonNull IMainActivity main) {
        main.log(eventTag, message);
    }

    @Override
    public void notify(@NonNull IMainActivity main) {
        main.notify(eventTag, message);
    }

    @Override
    public void send(@NonNull IMainActivity main) {
        main.send(eventTag, message);
    }

}
