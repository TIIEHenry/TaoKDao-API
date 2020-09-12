package taokdao.api.event.tags;

import androidx.annotation.NonNull;

import taokdao.api.api_public.R;
import taokdao.api.event.tag.IEventTag;
import taokdao.api.main.IMainContext;
import taokdao.api.ui.toolpage.IToolPage;

public class TabToolTag implements IEventTag {
    private final IToolPage tabtool;

    public TabToolTag(@NonNull IToolPage tabtool) {
        this.tabtool = tabtool;
    }

    @NonNull
    @Override
    public String getTag(@NonNull IMainContext main) {
        return main.getString(R.string.event_tabtool_prefix) + "(" + tabtool.getLabel() + ")";
    }

}
