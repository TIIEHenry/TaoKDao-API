package taokdao.api.event.tags;

import androidx.annotation.NonNull;

import taokdao.api.event.tag.IEventTag;
import taokdao.api.main.IMainContext;
import taokdao.api.ui.window.explorer.IExplorer;
import tiiehenry.taokdao.api.main.R;


public class ExplorerTag implements IEventTag {
    private final IExplorer explorer;

    public ExplorerTag(@NonNull IExplorer explorer) {
        this.explorer = explorer;
    }

    @NonNull
    @Override
    public String getTag(@NonNull IMainContext main) {
        return main.getString(R.string.event_explorer_prefix) + "(" + explorer.getLabel() + ")";
    }

}
