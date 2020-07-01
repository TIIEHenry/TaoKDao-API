package taokdao.api.event.tags;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;

import taokdao.api.event.tag.IEventTag;
import taokdao.api.main.IMainActivity;

public class EventTag implements IEventTag {
    private String label;
    private int id = -1;

    public EventTag(@StringRes int id) {
        this.id = id;
    }

    public EventTag(@NonNull String label) {
        this.label = label;
    }

    @NonNull
    @Override
    public String getTag(@NonNull IMainActivity main) {
        if (id != -1)
            return main.getString(id);
        return label;
    }

}
