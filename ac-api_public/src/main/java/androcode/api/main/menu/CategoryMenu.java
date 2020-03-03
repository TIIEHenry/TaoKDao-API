package androcode.api.main.menu;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.Arrays;

public class CategoryMenu {

    public String label;//唯一标识
    public Drawable icon;
    public MenuCallback callback;
    public ArrayList<String> showSuffix = new ArrayList<>();
    public ArrayList<String> hideSuffix = new ArrayList<>();

    public CategoryMenu(String label, Drawable icon, MenuCallback callback, String[] showSuffix, String[] hideSuffix) {
        this.label = label;
        this.icon = icon;
        this.callback = callback;
        this.showSuffix.addAll(Arrays.asList(showSuffix));
        this.hideSuffix.addAll(Arrays.asList(hideSuffix));
    }

    public CategoryMenu(String label, Drawable icon, MenuCallback callback) {
        this(label, icon, callback, new String[]{}, new String[]{});
    }

    public CategoryMenu(String label, MenuCallback callback) {
        this(label, null, callback, new String[]{}, new String[]{});
    }

    @Override
    public int hashCode() {
        return label.hashCode();
    }
}
