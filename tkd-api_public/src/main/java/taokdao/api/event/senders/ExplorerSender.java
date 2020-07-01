package taokdao.api.event.senders;

import androidx.annotation.NonNull;

import taokdao.api.event.send.IEventSender;
import taokdao.api.event.send.wrapped.EventSender;
import taokdao.api.event.tags.ExplorerTag;
import taokdao.api.ui.window.explorer.IExplorer;


public class ExplorerSender {
    private final IExplorer explorer;

    public ExplorerSender(@NonNull IExplorer explorer) {
        this.explorer = explorer;
    }


    public IEventSender message(@NonNull String message) {
        return new EventSender(new ExplorerTag(explorer), "Message: " + message);
    }


}
