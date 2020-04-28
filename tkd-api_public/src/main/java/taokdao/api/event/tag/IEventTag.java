package taokdao.api.event.tag;

import androidx.annotation.NonNull;

import taokdao.api.main.IMainActivity;

public interface IEventTag {
    @NonNull
    String getTag(@NonNull IMainActivity main);
}
