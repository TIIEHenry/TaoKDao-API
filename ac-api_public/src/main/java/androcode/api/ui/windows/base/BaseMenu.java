package androcode.api.ui.windows.base;

import android.graphics.drawable.Drawable;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import androcode.base.annotation.relation.MainConstructor;

public class BaseMenu<T extends BaseMenu> {
    @Nullable
    public Drawable icon;
    @Nullable
    public String label;
    @Nullable
    public View.OnClickListener click;
    @Nullable
    public View.OnClickListener longClick;

    private List<T> subMenuList = new ArrayList<>();


    @MainConstructor
    public BaseMenu(@Nullable Drawable icon, @Nullable String label, @Nullable View.OnClickListener click, @Nullable View.OnClickListener longClick) {
        this.icon = icon;
        this.label = label;
        this.click = click;
        this.longClick = longClick;
    }

    public List<T> getSubMenuList() {
        return subMenuList;
    }

    public void setSubMenuList(List<T> menus) {
        this.subMenuList.addAll(menus);
    }

    /**
     * @return false 显示submenu
     */
    public boolean click(View v) {
        if (getSubMenuList().size() == 0) {
            if (click != null) {
                click.onClick(v);
            }
        }
        return getSubMenuList().size() == 0 || click == null;
    }

    /**
     * @return false 显示submenu
     */
    public boolean longClick(View v) {
        if (longClick != null) {
            longClick.onClick(v);
        }
        return getSubMenuList().size() == 0 || longClick == null;
    }

    @NonNull
    public String toString() {
        return "BaseMenu(icon=" + this.icon + ", label=" + this.label + ", click=" + this.click + ", longClick=" + this.longClick + ")";
    }
}
