package androcode.api.menu;

import java.util.ArrayList;

import tiiehenry.androcode.api.main.R;

public enum CategloryMenuSet {
    FILE(R.id.main_menu_file),
    EDIT(R.id.main_menu_edit),
    BUILD(R.id.main_menu_build),
    PROJECT(R.id.main_menu_project),
    DISPLAY(R.id.main_menu_display),
    TOOL(R.id.main_menu_tool),
    SETTING(R.id.main_menu_setting);

    //view
    public int id;

    CategloryMenuSet(int id) {
        this.id = id;
    }

    public ArrayList<CategloryMenu> list = new ArrayList<>();

    /**
     * @param label        label as id
     * @param menuCallback callback
     * @return menu
     */
    public CategloryMenu addMenu(String label, MenuCallback menuCallback) {
        CategloryMenu a = null;
        for (CategloryMenu it : list) {
            if (it.label.equals(label)) {
                a = it;
            }
        }
        if (a != null) {
            list.remove(a);
        }
        CategloryMenu action = new CategloryMenu(label, menuCallback);
        list.add(action);
        return action;
    }
}
