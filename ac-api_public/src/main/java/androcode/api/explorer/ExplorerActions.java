package androcode.api.explorer;


import java.util.ArrayList;

import androcode.api.activity.IMainActivity;

public enum ExplorerActions {
    onRefresh("onRefresh");

    public String name;

    ExplorerActions(String name) {
        this.name = name;
    }

    public ArrayList<Observer> list = new ArrayList<>();

    public void addObserver(Observer o) {
        list.add(o);
    }

    public void removeObserver(Observer o) {
        list.remove(o);
    }

    public void runObservers(IMainActivity main) {
        for (Observer o : list) {
            o.onAction(main);
        }
    }

    interface Observer {
        void onAction(IMainActivity main);
    }
}
