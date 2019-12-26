package androcode.api.activity;

import java.util.ArrayList;

public enum MainActions implements ILifecycle {
    onCreate("onCreate"), onDestory("onDestory"),
    onPause("onPause"), onResume("onResume"),
    onStart("onStart"), onStop("onStop"),
    onAny("onAny"),

    AllFilesSaved("AllFilesSaved"), AllFilesSavedInThread("AllFilesSavedInThread");

    public String name;

    MainActions(String name) {
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
            o.onAction(main, this);
        }
    }

    interface Observer {
        void onAction(IMainActivity main, ILifecycle action);
    }
}
