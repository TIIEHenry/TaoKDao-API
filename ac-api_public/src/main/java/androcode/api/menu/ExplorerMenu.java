package androcode.api.menu;

import android.graphics.drawable.Drawable;

import java.io.File;
import java.util.ArrayList;

import androcode.api.activity.IMainActivity;

public class ExplorerMenu {
    public Callback callback;
    public Drawable icon;
    public String label;

    public ArrayList<String> supportSuffix = new ArrayList<>();
    public ArrayList<String> unsupportSuffix = new ArrayList<>();
    public Type type = Type.ALL;


    public ExplorerMenu(Drawable icon, String label, Callback callback) {
        this.icon = icon;
        this.label = label;
        this.callback = callback;
    }

    public ExplorerMenu( String label, Callback callback) {
        this(null, label, callback);
    }

    public enum Type {
        FILE, DIRECTORY, ALL
    }

    public interface Callback {
        boolean onAction(IMainActivity main, File file);
    }
    public boolean isSupportSuffix(String suffix){
        return supportSuffix.contains(suffix) ||
                (supportSuffix.size() == 0 && !unsupportSuffix.contains(suffix));
    }
}
