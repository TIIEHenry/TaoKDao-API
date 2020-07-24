package taokdao.api.ui.window.tabtool.menu;

import android.graphics.drawable.Drawable;
import android.view.View;

import androidx.annotation.Nullable;

import taokdao.api.ui.base.BaseMenu;
import taokdao.base.annotation.maintain.LongTerm;
import taokdao.base.annotation.relation.MainConstructor;

/**
 * 当click为null,subMenuList不为空时，点击显示子菜单
 * longClick,subMenuList不为空时，长按显示子菜单
 */
@LongTerm
public class TabToolMenu extends BaseMenu<TabToolMenu> {

    /**
     * 显示图标,icon不为null时默认显示
     */
    public boolean showIcon = false;
    /**
     * 显示标签,label不为null时默认显示
     */
    public boolean showLabel = false;

    /**
     * displayType 显示位置和样式
     */
    private DisplayType displayType = DisplayType.BAR;


    @MainConstructor
    public TabToolMenu(@Nullable Drawable icon, @Nullable String label, @Nullable View.OnClickListener click, @Nullable View.OnClickListener longClick) {
        super(icon, label, click, longClick);
        if (icon != null)
            showIcon = true;
        if (label != null)
            showLabel = true;
    }

    public TabToolMenu(Drawable icon, String label, View.OnClickListener click) {
        this(icon, label, click, null);
    }

    public TabToolMenu(Drawable icon, View.OnClickListener click) {
        this(icon, null, click, null);
    }

    public TabToolMenu(String label, View.OnClickListener click) {
        this(null, label, click, null);
    }

    public DisplayType getDisplayType() {
        return displayType;
    }

    public TabToolMenu setDisplayType(DisplayType type) {
        displayType = type;
        return this;
    }

    public enum DisplayType {
        /**
         * 窗口栏样式
         */
        BAR,
        /**
         * 弹出菜单
         */
        POPUP
    }

}
