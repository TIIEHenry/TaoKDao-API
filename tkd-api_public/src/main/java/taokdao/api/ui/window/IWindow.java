package taokdao.api.ui.window;

public interface IWindow {
    void showWindow();

    void hideWindow();

    boolean isWindowShown();

    void addStateObserver(WindowStateObserver observer);

    boolean removeStateObserver(WindowStateObserver observer);
}
