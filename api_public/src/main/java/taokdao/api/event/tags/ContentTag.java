package taokdao.api.event.tags;

import androidx.annotation.NonNull;

import ideditor.api.R;
import taokdao.api.event.tag.IEventTag;
import taokdao.api.main.IMainContext;


public class ContentTag implements IEventTag {
    private final String id;

    public ContentTag(@NonNull String id) {
        this.id = id;
    }

    @NonNull
    public static IEventTag getGlobal() {
        return main -> main.getString(R.string.event_content_prefix);
    }

    @NonNull
    @Override
    public String getTag(@NonNull IMainContext main) {
        return getGlobal().getTag(main) + "(" + id + ")";
    }

}
