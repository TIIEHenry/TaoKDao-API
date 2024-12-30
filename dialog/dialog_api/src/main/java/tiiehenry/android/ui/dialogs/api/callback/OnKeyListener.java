package tiiehenry.android.ui.dialogs.api.callback;

import android.view.KeyEvent;

import tiiehenry.android.ui.dialogs.api.IDialog;

/**
 * Interface definition for a callback to be invoked when a key event is
 * dispatched to this dialog. The callback will be invoked before the key
 * event is given to the dialog.
 */
public interface OnKeyListener {
    /**
     * Called when a key is dispatched to a dialog. This allows listeners to
     * get a chance to respond before the dialog.
     *
     * @param dialog  the dialog the key has been dispatched to
     * @param keyCode the code for the physical key that was pressed
     * @param event   the KeyEvent object containing full information about
     *                the event
     * @return {@code true} if the listener has consumed the event,
     * {@code false} otherwise
     */
    boolean onKey(IDialog dialog, int keyCode, KeyEvent event);
}