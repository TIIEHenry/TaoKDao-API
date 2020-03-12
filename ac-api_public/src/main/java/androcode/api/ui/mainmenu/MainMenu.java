package androcode.api.ui.mainmenu;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.Arrays;

public class MainMenu {

    public String label;//唯一标识
    public Drawable icon;
    public MainMenuCallback callback;
    public ArrayList<String> showSuffix = new ArrayList<>();
    public ArrayList<String> hideSuffix = new ArrayList<>();

    public MainMenu(String label, Drawable icon, MainMenuCallback callback, String[] showSuffix, String[] hideSuffix) {
        this.label = label;
        this.icon = icon;
        this.callback = callback;
        this.showSuffix.addAll(Arrays.asList(showSuffix));
        this.hideSuffix.addAll(Arrays.asList(hideSuffix));
    }

    public MainMenu(String label, Drawable icon, MainMenuCallback callback) {
        this(label, icon, callback, new String[]{}, new String[]{});
    }

    public MainMenu(String label, MainMenuCallback callback) {
        this(label, null, callback, new String[]{}, new String[]{});
    }

    @Override
    public int hashCode() {
        return label.hashCode();
    }
}
