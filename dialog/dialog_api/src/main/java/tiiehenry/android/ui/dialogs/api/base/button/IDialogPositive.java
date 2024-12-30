package tiiehenry.android.ui.dialogs.api.base.button;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;

import tiiehenry.android.ui.dialogs.api.callback.button.ButtonCallback;


public interface IDialogPositive<T> {

    /**
     * 设置确定按钮的文字
     *
     * @param textRes
     * @return
     */
    T positiveText(@StringRes int textRes);

    default T positiveText() {
        return positiveText(android.R.string.ok);
    }

    /**
     * 设置确定按钮的文字
     *
     * @param text
     * @return
     */
    T positiveText(@NonNull CharSequence text);

//    T positiveFocus(boolean isFocusedDefault);


    /**
     * 设置确定按钮的点击回调
     *
     * @param callback
     * @return
     */
    T onPositive(@NonNull ButtonCallback callback);
}
