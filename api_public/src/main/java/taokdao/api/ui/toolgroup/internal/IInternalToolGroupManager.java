package taokdao.api.ui.toolgroup.internal;

import taokdao.api.ui.toolgroup.internal.build.IBuildToolGroup;
import taokdao.api.ui.toolgroup.internal.search.ISearchToolGroup;
import taokdao.api.ui.toolgroup.internal.tip.ITipToolGroup;

public interface IInternalToolGroupManager {
    IBuildToolGroup getOrCreateBuildToolGroup();

    ITipToolGroup getOrCreateTipToolGroup();

    ISearchToolGroup getOrCreateSearchToolGroup();
}
