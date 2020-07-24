package taokdao.api.ui.dialog.callback;


import taokdao.api.ui.dialog.IDialog;

/**
 * Interface used to allow the creator of a dialog to run some code when the
 * dialog is shown.
 */
public interface OnShowListener {
    /**
     * This method will be invoked when the dialog is shown.
     *
     * @param dialog the dialog that was shown will be passed into the
     *               method
     */
    void onShow(IDialog dialog);
}