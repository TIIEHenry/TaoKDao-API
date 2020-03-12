package androcode.api.main.menu;

import android.graphics.drawable.Drawable;

import androcode.base.annotation.Identifier;

public class MainMenu {

    @Identifier
    public String label;//唯一标识
    public Drawable icon;
    public MainMenuCallback callback;

    public MainMenu(String label, Drawable icon, MainMenuCallback callback) {
        this.label = label;
        this.icon = icon;
        this.callback = callback;
    }

    public MainMenu(String label, MainMenuCallback callback) {
        this(label, null, callback);
    }

    @Override
    public int hashCode() {
        return label.hashCode();
    }
}
