package taokdao.api.ui.dialog.callback;

import android.content.DialogInterface;

import taokdao.api.ui.dialog.IDialog;

public interface OnCancelListener {
    /**
     * This method will be invoked when the dialog is canceled.
     *
     * @param dialog the dialog that was canceled will be passed into the
     *               method
     */
    void onCancel(IDialog dialog);
}