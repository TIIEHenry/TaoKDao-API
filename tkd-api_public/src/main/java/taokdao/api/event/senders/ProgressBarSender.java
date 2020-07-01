package taokdao.api.event.senders;

import androidx.annotation.NonNull;

import taokdao.api.event.send.IEventSender;
import taokdao.api.event.send.wrapped.EventSender;
import taokdao.api.event.tags.ProgressBarTag;
import taokdao.api.ui.progressbar.ProgressBarSet;
import taokdao.base.annotation.impl.InternalImpl;

@InternalImpl
public class ProgressBarSender {
    private final ProgressBarSet progressBar;

    public ProgressBarSender(@NonNull ProgressBarSet progressBar) {
        this.progressBar = progressBar;
    }

    public IEventSender addUser(@NonNull String user) {
        return new EventSender(new ProgressBarTag(progressBar), user + ": user added");
    }

    public IEventSender removeUser(@NonNull String user) {
        return new EventSender(new ProgressBarTag(progressBar), user + ": user removed");
    }
}

