package taokdao.api.main.action;

import java.util.ArrayList;

import taokdao.api.main.IMainContext;
import taokdao.api.base.annotation.todo.NeedClear;

@NeedClear
public enum MainAction {
    onCreate("onCreate"), onDestroy("onDestroy"),
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
    onLandscape("onLandscape"),
    onPortrait("onPortrait"),

//    onUiDark("onUiDark"),
//    onUiLight("onUiLight"),

    onPluginListReloaded("onPluginListReloaded"),
    onContentSettingChanged("onContentSettingChanged"),

    CurrentFileSaved("CurrentFileSaved"),
    AllFilesSaved("AllFilesSaved");

    public String name;
    public ArrayList<MainActionObserver> list = new ArrayList<>();

    MainAction(String name) {
        this.name = name;
    }

    public static void clearAll() {
        for (MainAction value : values()) {
            value.clear();
        }
    }

    public void addObserver(MainActionObserver o) {
        list.add(o);
    }

    public void removeObserver(MainActionObserver o) {
        list.remove(o);
    }

    public void runObservers(IMainContext main) {
        for (MainActionObserver o : list) {
            o.onAction(main);
        }
    }

    public void clear() {
        list.clear();
    }

}
