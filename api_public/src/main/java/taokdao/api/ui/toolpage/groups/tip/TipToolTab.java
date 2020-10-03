package taokdao.api.ui.toolpage.groups.tip;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import taokdao.api.data.bean.IProperties;
import taokdao.api.ui.toolpage.content.tree.TreeItem;
import taokdao.api.ui.toolpage.group.tooltab.wrapped.BaseToolTab;

public class TipToolTab extends BaseToolTab<List<TreeItem>> implements ITipToolTab {
    public TipToolTab(@NonNull IProperties properties, @Nullable Drawable icon, List<TreeItem> content) {
        super(properties, icon, content);
    }
}
