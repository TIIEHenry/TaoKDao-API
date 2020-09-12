package taokdao.api.ui.toolpage.internal;

import taokdao.api.ui.toolpage.internal.build.IBuildToolGroup;
import taokdao.api.ui.toolpage.internal.search.ISearchToolGroup;
import taokdao.api.ui.toolpage.internal.tip.ITipToolGroup;

public interface IInternalToolPageManager {
    IBuildToolGroup getOrCreateBuildGroup();

    ITipToolGroup getOrCreateTipGroup();

    ISearchToolGroup getOrCreateSearchGroup();
}
