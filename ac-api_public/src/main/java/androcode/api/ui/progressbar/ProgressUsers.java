package androcode.api.ui.progressbar;

import java.util.ArrayList;

/**
 * 控制底部的横向进度条
 */
public enum ProgressUsers {
    BOTTOM_HORIZONTAL;

    public Runnable refresh;
    public ArrayList<String> userList = new ArrayList<>();

    public static void clearAll() {
        for (ProgressUsers value : values()) {
            value.clear();
        }
    }

    public void refresh() {
        if (refresh != null)
            refresh.run();
    }

    public void addUser(String id) {
        userList.add(id);
        refresh();
    }

    public void removeUser(String id) {
        userList.remove(id);
        refresh();
    }

    public void clear() {
        userList.clear();
    }
}
