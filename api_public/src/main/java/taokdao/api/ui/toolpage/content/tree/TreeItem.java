package taokdao.api.ui.toolpage.content.tree;

import android.graphics.drawable.Drawable;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class TreeItem {
    @Nullable
    public Drawable icon;
    public String title;
    public String hint;
    public String message;
    @Nullable
    public TreeItem parent;
    public ArrayList<TreeItem> children = new ArrayList<>();
    @Nullable
    public ITreeItemCallback callback;

    public TreeItem(String title, String hint, String message) {
        this.title = title;
        this.hint = hint;
        this.message = message;
    }

    public boolean hasChild() {
        return !children.isEmpty();
    }

    public void addChild(TreeItem child) {
        children.add(child);
        child.parent = this;
    }

    public void removeChild(TreeItem child) {
        children.remove(child);
        child.parent = null;
    }

    @Override
    public String toString() {
        return "TreeItem{" +
                "icon=" + icon +
                ", title='" + title + '\'' +
                ", hint='" + hint + '\'' +
                ", message='" + message + '\'' +
//                ", parent=" + parent +
                ", children=" + children +
                '}';
    }
}
