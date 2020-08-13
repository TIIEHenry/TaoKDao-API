package taokdao.api.event.tags;

import androidx.annotation.NonNull;

import taokdao.api.api_public.R;
import taokdao.api.event.tag.IEventTag;
import taokdao.api.main.IMainContext;
import taokdao.api.ui.progressbar.ProgressBarSet;

public class ProgressBarTag implements IEventTag {
    private final ProgressBarSet progressBar;

    public ProgressBarTag(@NonNull ProgressBarSet progressBar) {
        this.progressBar = progressBar;
    }

    @NonNull
    @Override
    public String getTag(@NonNull IMainContext main) {
        return main.getString(R.string.event_progressbar_prefix) + "(" + progressBar.label + ")";
    }
}
