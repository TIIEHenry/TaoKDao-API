package tiiehenry.android.ui.dialogs.api.base.button;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;

import tiiehenry.android.ui.dialogs.api.IDialog;
import tiiehenry.android.ui.dialogs.api.callback.button.ButtonCallback;

public interface IDialogNegative<T> {

    T negativeText(@StringRes int textRes);

    default T negativeText() {
        onNegative(IDialog::dismiss);
        return negativeText(android.R.string.cancel);
    }

    /**
     * 设置否定按钮的文字
     *
     * @param text
     * @return
     */
    T negativeText(@NonNull CharSequence text);

//    T negativeFocus(boolean isFocusedDefault);

    /**
     * 设置否定按钮的点击回调
     *
     * @param callback
     * @return
     */
    T onNegative(@NonNull ButtonCallback callback);

}
