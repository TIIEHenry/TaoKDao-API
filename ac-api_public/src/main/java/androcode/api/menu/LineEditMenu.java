package androcode.api.menu;

import java.util.ArrayList;

public class LineEditMenu {

    public static ArrayList<CategloryMenu> list = new ArrayList<>();

    private LineEditMenu() {

    }


    public static CategloryMenu addMenu(String label, MenuCallback menuCallback) {
        CategloryMenu a = null;
        for (CategloryMenu it : list) {
            if (it.label.equals(label)) {
                a = it;
            }
        }
        if (a != null) {
            CategloryMenuSet.EDIT.list.remove(a);
            list.remove(a);
        }
        CategloryMenu action = new CategloryMenu(label, menuCallback);
        list.add(action);
        CategloryMenuSet.EDIT.list.add(action);
        return action;
    }
}
