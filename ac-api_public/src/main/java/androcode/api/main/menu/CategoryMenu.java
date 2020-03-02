package androcode.api.main.menu;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class CategoryMenu {

    public static CategoryMenu FILE;


    public String label;//唯一标识
    public Drawable icon;
    public int iconID;
    public MenuCallback callback;
    public ArrayList<String> supportSuffix = new ArrayList<>();
    public ArrayList<String> unsupportSuffix = new ArrayList<>();

    public CategoryMenu(String label, MenuCallback callback) {
        this.label = label;
        this.callback = callback;
    }

    @Override
    public int hashCode() {
        return label.hashCode();
    }
}
