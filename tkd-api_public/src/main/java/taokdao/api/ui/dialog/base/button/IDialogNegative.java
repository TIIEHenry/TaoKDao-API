package taokdao.api.ui.dialog.base.button;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;

import taokdao.api.ui.dialog.DialogAction;
import taokdao.api.ui.dialog.IDialog;
import taokdao.api.ui.dialog.callback.SingleButtonCallback;

public interface IDialogNegative<T> {

    T negativeText(@StringRes int textRes);

    default T negativeText() {
        onNegative((dialog, which) -> {
            dialog.dismiss();
        });
        return negativeText(android.R.string.cancel);
    }

    /**
     * 设置否定按钮的文字
     *
     * @param text
     * @return
     */
    T negativeText(@NonNull CharSequence text);

    T negativeFocus(boolean isFocusedDefault);

    /**
     * 设置否定按钮的点击回调
     *
     * @param callback
     * @return
     */
    T onNegative(@NonNull SingleButtonCallback callback);

}
