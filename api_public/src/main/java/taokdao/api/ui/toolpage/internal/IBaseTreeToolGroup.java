package taokdao.api.ui.toolpage.internal;

import java.util.List;

import taokdao.api.ui.toolpage.content.tree.TreeItem;
import taokdao.api.ui.toolpage.group.IToolGroup;

public interface IBaseTreeToolGroup extends IToolGroup<List<TreeItem>> {

    public void refreshContent();

}
