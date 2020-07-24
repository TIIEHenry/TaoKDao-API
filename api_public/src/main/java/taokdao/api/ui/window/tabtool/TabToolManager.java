package taokdao.api.ui.window.tabtool;

import taokdao.api.ui.window.tabtools.build.IBuildTabTool;
import taokdao.api.ui.window.tabtools.event.IEventTabTool;
import taokdao.api.ui.window.tabtools.search.ISearchTabTool;
import taokdao.api.ui.window.tabtools.tip.ITipTabTool;

public interface TabToolManager {
    IEventTabTool getEventTabTool();

    IBuildTabTool getBuildTabTool();

    ITipTabTool getTipTabTool();

    ISearchTabTool getTSearchTabTool();
}
