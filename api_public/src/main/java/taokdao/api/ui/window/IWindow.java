package taokdao.api.ui.window;

import androidx.annotation.NonNull;

import taokdao.api.ui.window.callback.WindowStateObserver;

public interface IWindow<T extends IWindow<?>> {
    void showWindow();

    void hideWindow();

    boolean isWindowShown();

    void addStateObserver(@NonNull WindowStateObserver<T> observer);

    boolean removeStateObserver(@NonNull WindowStateObserver<T> observer);
}
