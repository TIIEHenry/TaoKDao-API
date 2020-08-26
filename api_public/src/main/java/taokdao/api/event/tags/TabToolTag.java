package taokdao.api.event.tags;

import androidx.annotation.NonNull;

import taokdao.api.api_public.R;
import taokdao.api.event.tag.IEventTag;
import taokdao.api.main.IMainContext;
import taokdao.api.ui.toolgroup.IToolGroup;

public class TabToolTag implements IEventTag {
    private final IToolGroup tabtool;

    public TabToolTag(@NonNull IToolGroup tabtool) {
        this.tabtool = tabtool;
    }

    @NonNull
    @Override
    public String getTag(@NonNull IMainContext main) {
        return main.getString(R.string.event_tabtool_prefix) + "(" + tabtool.getLabel() + ")";
    }

}
