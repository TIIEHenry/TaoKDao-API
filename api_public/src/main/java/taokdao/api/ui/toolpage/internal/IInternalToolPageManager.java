package taokdao.api.ui.toolpage.internal;

import taokdao.api.ui.toolpage.groups.build.IBuildToolGroup;
import taokdao.api.ui.toolpage.groups.search.ISearchToolGroup;
import taokdao.api.ui.toolpage.groups.tip.ITipToolGroup;

public interface IInternalToolPageManager {
    IBuildToolGroup getOrCreateBuildGroup();

    ITipToolGroup getOrCreateTipGroup();

    ISearchToolGroup getOrCreateSearchGroup();
}
