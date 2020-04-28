package taokdao.api.ui.content.menu;

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
public class ContentMenu extends BaseMenu<ContentMenu> {


    @MainConstructor
    public ContentMenu(@Nullable Drawable icon, @Nullable String label, @Nullable View.OnClickListener click, @Nullable View.OnClickListener longClick) {
        super(icon, label, click, longClick);
    }

    public ContentMenu(Drawable icon, String label, View.OnClickListener click) {
        this(icon, label, click, null);
    }

    public ContentMenu(String label, View.OnClickListener click) {
        this(null, label, click, null);
    }


}
