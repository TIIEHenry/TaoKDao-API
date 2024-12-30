package taokdao.api.ui.content.menu;

import android.graphics.drawable.Drawable;
import android.view.View;

import androidx.annotation.Nullable;

import taokdao.api.base.annotation.maintain.LongTerm;
import taokdao.api.base.annotation.relation.MainConstructor;
import taokdao.api.ui.base.BaseMenu;

/**
 * 当click为null,subMenuList不为空时，点击显示子菜单
 * longClick,subMenuList不为空时，长按显示子菜单
 */
@LongTerm
public class ControlMenu extends BaseMenu<ControlMenu> {


    @MainConstructor
    public ControlMenu(@Nullable Drawable icon, @Nullable String label, @Nullable View.OnClickListener click, @Nullable View.OnClickListener longClick) {
        super(icon, label, click, longClick);
    }

    public ControlMenu(Drawable icon, String label, View.OnClickListener click) {
        this(icon, label, click, null);
    }

    public ControlMenu(String label, View.OnClickListener click) {
        this(null, label, click, null);
    }


}
