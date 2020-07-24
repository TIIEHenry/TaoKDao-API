package taokdao.api.event.tag;

import androidx.annotation.NonNull;

import taokdao.api.main.IMainContext;

public interface IEventTag {
    @NonNull
    String getTag(@NonNull IMainContext main);
}
