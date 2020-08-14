package taokdao.api.event.record;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;

import taokdao.api.event.tag.IEventTag;

/**
 * send=log+notify
 */
public interface IEventRecorder {

    /**
     * 记录信息
     *
     * @param tag     标签
     * @param message 信息
     */
    void log(@NonNull String tag, @NonNull String message);

    void log(@NonNull String message);

    void log(@StringRes int message);

    void log(@NonNull IEventTag type, @StringRes int message);

    void log(@NonNull IEventTag type, @NonNull String message);

    default void log(@Nullable Object message) {
        if (message == null)
            log("null");
        else
            log(message.toString());
    }

    /**
     * 显示信息
     *
     * @param tag     标签
     * @param message 信息
     */
    void notify(@NonNull String tag, @NonNull String message);

    void notify(@NonNull String message);

    void notify(@StringRes int message);

    void notify(@NonNull IEventTag type, @StringRes int message);

    void notify(@NonNull IEventTag type, @NonNull String message);

    default void notify(@Nullable Object message) {
        if (message == null)
            notify("null");
        else
            notify(message.toString());
    }

    /**
     * 记录并显示
     *
     * @param tag     标签
     * @param message 信息
     */
    default void send(@NonNull String tag, @NonNull String message) {
        log(tag, message);
        notify(tag, message);
    }

    default void send(@NonNull String message) {
        log(message);
        notify(message);
    }

    default void send(@StringRes int message) {
        log(message);
        notify(message);
    }

    default void send(@NonNull IEventTag type, @StringRes int message) {
        log(type, message);
        notify(type, message);
    }

    default void send(@NonNull IEventTag type, @NonNull String message) {
        log(type, message);
        notify(type, message);
    }

    default void send(@Nullable Object message) {
        if (message == null)
            send("null");
        else
            send(message.toString());
    }
}
