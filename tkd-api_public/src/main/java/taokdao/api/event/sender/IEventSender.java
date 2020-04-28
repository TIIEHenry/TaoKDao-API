package taokdao.api.event.sender;

import androidx.annotation.NonNull;

import taokdao.api.main.IMainActivity;

public interface IEventSender {
    void log(@NonNull IMainActivity main);
    void notify(@NonNull IMainActivity main);
    void send(@NonNull IMainActivity main);
}
