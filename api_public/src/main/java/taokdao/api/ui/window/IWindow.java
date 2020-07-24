package taokdao.api.ui.window;

import androidx.annotation.NonNull;

public interface IWindow {
    void showWindow();

    void hideWindow();

    boolean isWindowShown();

    void addStateObserver(@NonNull WindowStateObserver observer);

    boolean removeStateObserver(@NonNull WindowStateObserver observer);
}
