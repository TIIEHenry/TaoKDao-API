package taokdao.api.ui.dialog.base.button;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;

import taokdao.api.ui.dialog.callback.SingleButtonCallback;

public interface IDialogNeutral<T> {

    /**
     * 设置中性按钮的文字
     *
     * @param textRes
     * @return
     */
    T neutralText(@StringRes int textRes);


    /**
     * 设置中性按钮的文字
     *
     * @param text
     * @return
     */
    T neutralText(@NonNull CharSequence text);


    T neutralFocus(boolean isFocusedDefault);

    /**
     * 设置中性按钮的点击回调
     *
     * @param callback
     * @return
     */
    T onNeutral(@NonNull SingleButtonCallback callback);
}
