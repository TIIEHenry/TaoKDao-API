package androcode.api.menu;

import android.graphics.drawable.Drawable;

import java.io.File;
import java.util.ArrayList;

public class CategloryMenu {

    public static CategloryMenu FILE;


    public String label;//唯一标识
    public Drawable icon;
    public int iconID;
    public MenuCallback callback;
    public ArrayList<String> supportSuffix = new ArrayList<>();
    public ArrayList<String> unsupportSuffix = new ArrayList<>();

    public CategloryMenu(String label, MenuCallback callback) {
        this.label = label;
        this.callback = callback;
    }

    @Override
    public int hashCode() {
        return label.hashCode();
    }
}
