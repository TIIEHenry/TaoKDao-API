package taokdao.api.ui.window.callback;

import androidx.annotation.NonNull;

import taokdao.api.ui.window.IWindow;

public class BaseWindowStateObserver<T extends IWindow<?>> implements WindowStateObserver<T> {
    @Override
    public void onWindowCreated(@NonNull T window) {

    }

    @Override
    public void onWindowShow(@NonNull T window) {

    }

    @Override
    public void onWindowHide(@NonNull T window) {

    }
}
