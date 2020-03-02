package androcode.api.main.menu;

import android.graphics.drawable.Drawable;

import java.io.File;
import java.util.ArrayList;

import androcode.api.main.IMainActivity;

/**
 * 浏览器界面长按的菜单
 */
public class ExplorerMenu {
    public Callback callback;
    public Drawable icon;
    public String label;
    /**
     * 菜单根据文件后缀是否在supportSuffix中显示
     */
    public ArrayList<String> supportSuffix = new ArrayList<>();
    /**
     * supportSuffix为空的情况下，默认为都支持，unsupportSuffix用来排除不支持的后缀
     */
    public ArrayList<String> unsupportSuffix = new ArrayList<>();
    public Type type = Type.ALL;


    public ExplorerMenu(Drawable icon, String label, Callback callback) {
        this.icon = icon;
        this.label = label;
        this.callback = callback;
    }

    public ExplorerMenu(String label, Callback callback) {
        this(null, label, callback);
    }

    public enum Type {
        FILE, DIRECTORY, ALL
    }

    public interface Callback {
        boolean onAction(IMainActivity main, File file);
    }

    public boolean isSupportSuffix(String suffix) {
        return supportSuffix.contains(suffix) ||
                (supportSuffix.size() == 0 && !unsupportSuffix.contains(suffix));
    }
}
