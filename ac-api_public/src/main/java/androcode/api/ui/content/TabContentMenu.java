package androcode.api.ui.content;

import android.graphics.drawable.Drawable;
import android.view.View;

import androidx.annotation.Nullable;

import androcode.api.ui.windows.BaseMenu;
import androcode.base.annotation.relation.MainConstructor;
import androcode.base.annotation.maintain.LongTerm;

/**
 * 当click为null,subMenuList不为空时，点击显示子菜单
 * longClick,subMenuList不为空时，长按显示子菜单
 */
@LongTerm
public class TabContentMenu extends BaseMenu<TabContentMenu> {


    @MainConstructor
    public TabContentMenu(@Nullable Drawable icon, @Nullable String label, @Nullable View.OnClickListener click, @Nullable View.OnClickListener longClick) {
        super(icon, label, click, longClick);
    }

    public TabContentMenu(Drawable icon, String label, View.OnClickListener click) {
        this(icon, label, click, null);
    }

    public TabContentMenu(String label, View.OnClickListener click) {
        this(null, label, click, null);
    }


}
