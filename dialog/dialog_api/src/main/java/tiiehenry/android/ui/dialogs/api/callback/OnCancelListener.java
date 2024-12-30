package tiiehenry.android.ui.dialogs.api.callback;

import tiiehenry.android.ui.dialogs.api.IDialog;

public interface OnCancelListener {
    /**
     * This method will be invoked when the dialog is canceled.
     *
     * @param dialog the dialog that was canceled will be passed into the
     *               method
     */
    void onCancel(IDialog dialog);
}