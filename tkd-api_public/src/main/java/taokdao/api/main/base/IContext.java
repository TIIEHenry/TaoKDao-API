package taokdao.api.main.base;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;

public interface IContext {

    Resources getResources();

    Context getContext();

    /**
     * 资源类
     */
    Drawable getDrawable(int id);

    String getString(int id);

    int getAttrColor(int id);

    int getDimen(int id);

    LayoutInflater getLayoutInflater();
}
