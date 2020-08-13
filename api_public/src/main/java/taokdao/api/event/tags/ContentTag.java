package taokdao.api.event.tags;

import androidx.annotation.NonNull;

import taokdao.api.api_public.R;
import taokdao.api.event.tag.IEventTag;
import taokdao.api.main.IMainContext;
import taokdao.api.ui.content.IContent;


public class ContentTag implements IEventTag {
    private final IContent content;

    public ContentTag(@NonNull IContent content) {
        this.content = content;
    }

    @NonNull
    public static IEventTag getGlobal() {
        return main -> main.getString(R.string.event_content_prefix);
    }

    @NonNull
    @Override
    public String getTag(@NonNull IMainContext main) {
        return getGlobal().getTag(main) + "(" + content.id() + ")";
    }

}
