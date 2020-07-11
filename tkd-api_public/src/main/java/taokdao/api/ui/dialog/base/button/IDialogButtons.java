package taokdao.api.ui.dialog.base.button;

import androidx.annotation.NonNull;

import taokdao.api.ui.dialog.callback.OnAnyCallback;
import taokdao.api.ui.dialog.callback.SingleButtonCallback;

public interface IDialogButtons<T> extends IDialogNegative<T>, IDialogNeutral<T>, IDialogPositive<T> {

    T onAny(@NonNull OnAnyCallback callback);

    /**
     * This defaults to true. If set to false, the dialog will not automatically be dismissed when
     * an action button is pressed, and not automatically dismissed when the user selects a list
     * item.
     *
     * @param dismiss Whether or not to dismiss the dialog automatically.
     * @return The Builder instance so you can chain calls to it.
     */
    T autoDismiss(boolean dismiss);
}
