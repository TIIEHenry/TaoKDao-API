package androcode.api.file.operator;

import android.graphics.drawable.Drawable;

import java.io.File;
import java.util.ArrayList;

import androcode.api.annotation.MainConstructor;
import androcode.api.main.IMainActivity;


/**
 * 文件浏览器界面长按的菜单
 * 实现对文件操作
 */
public class FileOperator {
    public String label;
    public Drawable icon;
    private Callback callback;
    public Checker checker;


    @MainConstructor
    public FileOperator(Drawable icon, String label, Callback callback, Checker checker) {
        this.icon = icon;
        this.label = label;
        this.callback = callback;
        this.checker = checker;
    }

    public FileOperator(String label, Callback callback, Checker checker) {
        this(null, label, callback, checker);
    }


    public boolean call(IMainActivity main, File file) {
        return callback.onAction(main, file);
    }

    public interface Callback {
        boolean onAction(IMainActivity main, File file);
    }

    /**
     * check support can operate
     */
    public interface Checker {
        boolean isSupport(File file);
    }

}
