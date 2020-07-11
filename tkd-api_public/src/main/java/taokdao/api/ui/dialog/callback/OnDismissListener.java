package taokdao.api.ui.dialog.callback;

import android.content.DialogInterface;

import taokdao.api.ui.dialog.IDialog;

public interface OnDismissListener {
    /**
     * This method will be invoked when the dialog is dismissed.
     *
     * @param dialog the dialog that was dismissed will be passed into the
     *               method
     */
    void onDismiss(IDialog dialog);
}