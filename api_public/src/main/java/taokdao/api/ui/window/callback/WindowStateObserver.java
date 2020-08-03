package taokdao.api.ui.window.callback;

import androidx.annotation.NonNull;

import taokdao.api.ui.window.IWindow;

public interface WindowStateObserver<T extends IWindow<?>> {

//    void onWindowCreated(@NonNull T window);

    void onWindowShow(@NonNull T window);

    void onWindowHide(@NonNull T window);

}
