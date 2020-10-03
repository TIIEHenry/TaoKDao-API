package taokdao.api.ui.toolpage.groups.search;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import taokdao.api.data.bean.IProperties;
import taokdao.api.ui.toolpage.content.tree.TreeItem;
import taokdao.api.ui.toolpage.group.tooltab.wrapped.BaseToolTab;

public class SearchToolTab extends BaseToolTab<List<TreeItem>> implements ISearchToolTab {
    public SearchToolTab(@NonNull IProperties properties, @Nullable Drawable icon, List<TreeItem> content) {
        super(properties, icon, content);
    }
}

