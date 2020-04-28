package taokdao.api.event.tags;

import androidx.annotation.NonNull;

import taokdao.api.main.IMainActivity;
import taokdao.api.event.tag.IEventTag;
import taokdao.api.ui.window.tabtool.ITabTool;
import tiiehenry.taokdao.api.main.R;

public class TabToolTag implements IEventTag {
    private final ITabTool tabtool;

    public TabToolTag(@NonNull ITabTool tabtool) {
        this.tabtool = tabtool;
    }

    @NonNull
    @Override
    public String getTag(@NonNull IMainActivity main) {
        return main.getString(R.string.event_tabtool_prefix) + "(" + tabtool.getLabel() + ")";
    }

}
