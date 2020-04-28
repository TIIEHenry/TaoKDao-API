package taokdao.api.plugin.internal;

import androidx.annotation.NonNull;

import taokdao.api.main.IMainActivity;

/**
 * java实现的plugin需要实现该接口
 */
public interface IDexPlugin {

    void onLoad(@NonNull IMainActivity main);

    void onInit(@NonNull IMainActivity main);

    void onCall(@NonNull IMainActivity main);

    void onDestroy(@NonNull IMainActivity main);
}
