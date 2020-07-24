package taokdao.api.main.action;

import taokdao.api.main.IMainContext;

public interface MainActionObserver {
    void onAction(IMainContext main);
}
