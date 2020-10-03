package taokdao.api.ui.toolpage.groups.build;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import taokdao.api.data.bean.IProperties;
import taokdao.api.ui.toolpage.content.tree.TreeItem;
import taokdao.api.ui.toolpage.group.tooltab.wrapped.BaseToolTab;

public class BuildToolTab extends BaseToolTab<List<TreeItem>> implements IBuildToolTab {
    public BuildToolTab(@NonNull IProperties properties, @Nullable Drawable icon, List<TreeItem> content) {
        super(properties, icon, content);
    }
}
