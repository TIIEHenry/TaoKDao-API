package androcode.api.activity;

import java.util.ArrayList;

public enum MainActions  {
    onCreate("onCreate"), onDestory("onDestory"),
    onPause("onPause"), onResume("onResume"),
    onStart("onStart"), onStop("onStop"),
    onAny("onAny"),
    onProjectOpened("onProjectOpened"),
    onProjectClosed("onProjectClosed"),
    onFileRenamed("onFileRenamed"),
    onFileCreated("onFileCreated"),
    onFileDeleted("onFileDeleted"),
    //screen onOrientationChanged
    onOrientationChanged("onOrientationChanged"),
    onHorizontal("onHorizontal"),
    onVertical("onVertical"),

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
            o.onAction(main);
        }
    }

    interface Observer {
        void onAction(IMainActivity main);
    }
}
