package taokdao.api.main.menu;

import java.util.ArrayList;

import ideditor.api.R;


public enum MainMenuCategory {
    FILE(R.id.iv_main_menu_file),
    EDIT(R.id.iv_main_menu_edit),
    BUILD(R.id.iv_main_menu_build),
    PROJECT(R.id.iv_main_menu_project),
    DISPLAY(R.id.iv_main_menu_display),
    TOOL(R.id.iv_main_menu_tool),
    SETTING(R.id.iv_main_menu_setting);

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
        return addMenu(new MainMenu(label, mainMenuCallback));
    }

    /**
     * @param menu MainMenu
     * @return menu
     */
    public MainMenu addMenu(MainMenu menu) {
        MainMenu a = null;
        for (MainMenu it : list) {
            if (it.label.equals(menu.label)) {
                a = it;
            }
        }
        if (a != null) {
            list.remove(a);
        }
        list.add(menu);
        return menu;
    }

    public void clear() {
        list.clear();
    }
}
