package tiiehenry.android.ui.dialogs.api.strategy.loading;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;

public interface IDialogLoading<T> {
    /**
     * 最短显示时间
     *
     * @param delay
     * @return
     */
    T minDisplayTime(long delay);

    T addLoadingTask(@NonNull CharSequence text, @NonNull ILoadingTask task);

    T addLoadingTask(@StringRes int text, @NonNull ILoadingTask task);

    /**
     * execute loading task after show
     * default true
     *
     * @param auto
     * @return
     */
    T autoExecuteTask(boolean auto);
}
