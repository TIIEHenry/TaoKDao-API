package taokdao.api.ui.content.menu;

import android.graphics.drawable.Drawable;
import android.view.View;

import androidx.annotation.Nullable;

import taokdao.api.ui.base.BaseMenu;
import taokdao.base.annotation.maintain.LongTerm;
import taokdao.base.annotation.relation.MainConstructor;

@LongTerm
public class QuickMenu extends BaseMenu<ControlMenu> {

    @MainConstructor
    public QuickMenu(@Nullable Drawable icon, @Nullable String label, @Nullable View.OnClickListener click, @Nullable View.OnClickListener longClick) {
        super(icon, label, click, longClick);
    }

    public QuickMenu(@Nullable Drawable icon, @Nullable String label, @Nullable View.OnClickListener click) {
        this(icon, label, click, null);
    }
}