package androcode.api.main.menu;

import java.util.ArrayList;

import tiiehenry.androcode.api.main.R;

public enum MainMenuCategory {
    FILE(R.id.main_menu_file),
    EDIT(R.id.main_menu_edit),
    BUILD(R.id.main_menu_build),
    PROJECT(R.id.main_menu_project),
    DISPLAY(R.id.main_menu_display),
    TOOL(R.id.main_menu_tool),
    SETTING(R.id.main_menu_setting);

    //view
    public int id;
    public ArrayList<MainMenu> list = new ArrayList<>();

    MainMenuCategory(int id) {
        this.id = id;
    }

    public static void clearAll() {
        for (MainMenuCategory value : values()) {
            value.clear();
        }
    }

    /**
     * @param label            label as id
     * @param mainMenuCallback callback
     * @return menu
     */
    public MainMenu addMenu(String label, MainMenuCallback mainMenuCallback) {
        MainMenu a = null;
        for (MainMenu it : list) {
            if (it.label.equals(label)) {
                a = it;
            }
        }
        if (a != null) {
            list.remove(a);
        }
        MainMenu action = new MainMenu(label, mainMenuCallback);
        list.add(action);
        return action;
    }

    public void clear() {
        list.clear();
    }
}
