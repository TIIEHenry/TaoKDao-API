package androcode.api.ui.windows;

public interface IWindow {
    void showWindow();

    void hideWindow();

    boolean isWindowShown();

    void addStateObserver(WindowStateObserver observer);

    boolean removeStateObserver(WindowStateObserver observer);
}
