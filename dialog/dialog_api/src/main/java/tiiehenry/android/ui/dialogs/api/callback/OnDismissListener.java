package tiiehenry.android.ui.dialogs.api.callback;

import tiiehenry.android.ui.dialogs.api.IDialog;

public interface OnDismissListener {
    /**
     * This method will be invoked when the dialog is dismissed.
     *
     * @param dialog the dialog that was dismissed will be passed into the
     *               method
     */
    void onDismiss(IDialog dialog);
}