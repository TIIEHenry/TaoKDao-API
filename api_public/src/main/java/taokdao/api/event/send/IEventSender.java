package taokdao.api.event.send;

import androidx.annotation.NonNull;

import taokdao.api.main.IMainContext;

public interface IEventSender {
    void log(@NonNull IMainContext main);

    void notify(@NonNull IMainContext main);

    void send(@NonNull IMainContext main);
}
