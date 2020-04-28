package taokdao.api.ui.window.explorer.menu;

import android.graphics.drawable.Drawable;
import android.view.View;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;

import taokdao.api.main.IMainActivity;
import taokdao.api.ui.base.BaseMenu;

public class ExplorerMenu extends BaseMenu<ExplorerMenu> {

    public ExplorerMenu(@Nullable Drawable icon, @NonNull String label, @NonNull View.OnClickListener click, @Nullable View.OnClickListener longClick) {
        super(icon, label, click, longClick);
    }

    public ExplorerMenu(Drawable icon, String label, View.OnClickListener click) {
        this(icon, label, click, null);
    }

    public ExplorerMenu(IMainActivity main, @DrawableRes int icon, @StringRes int label, View.OnClickListener click, @Nullable View.OnClickListener longClick) {
        this(main.getDrawable(icon), main.getString(label), click, longClick);
    }

    public ExplorerMenu(IMainActivity main, @DrawableRes int icon, @StringRes int label, View.OnClickListener click) {
        this(main, icon, label, click, null);
    }


    @NonNull
    public String toString() {
        return "ExplorerMenus(icon=" + this.icon + ", label=" + this.label + ", click=" + this.click + ", longClick=" + this.longClick + ")";
    }

}
