package taokdao.api.event.tags;

import androidx.annotation.NonNull;

import taokdao.api.event.tag.IEventTag;
import taokdao.api.main.IMainContext;

public class ProjectLoaderTag implements IEventTag {
    @NonNull
    @Override
    public String getTag(@NonNull IMainContext main) {
        return "ProjectLoader";
    }
}
