package androcode.api.main.menu;

import java.util.ArrayList;

import tiiehenry.androcode.api.main.R;

public enum CategoryMenuSet {
    FILE(R.id.main_menu_file),
    EDIT(R.id.main_menu_edit),
    BUILD(R.id.main_menu_build),
    PROJECT(R.id.main_menu_project),
    DISPLAY(R.id.main_menu_display),
    TOOL(R.id.main_menu_tool),
    SETTING(R.id.main_menu_setting);

    //view
    public int id;

    CategoryMenuSet(int id) {
        this.id = id;
    }

    public ArrayList<CategoryMenu> list = new ArrayList<>();

    /**
     * @param label        label as id
     * @param menuCallback callback
     * @return menu
     */
    public CategoryMenu addMenu(String label, MenuCallback menuCallback) {
        CategoryMenu a = null;
        for (CategoryMenu it : list) {
            if (it.label.equals(label)) {
                a = it;
            }
        }
        if (a != null) {
            list.remove(a);
        }
        CategoryMenu action = new CategoryMenu(label, menuCallback);
        list.add(action);
        return action;
    }
}
