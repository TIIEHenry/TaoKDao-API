package androcode.api.progressbar;

import java.util.ArrayList;

public enum ProgressUser {
    BOTTOM_HORIZONTAL;

    public Runnable refresh;
    public ArrayList<String> userList = new ArrayList<>();

    public void refresh() {
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
}
