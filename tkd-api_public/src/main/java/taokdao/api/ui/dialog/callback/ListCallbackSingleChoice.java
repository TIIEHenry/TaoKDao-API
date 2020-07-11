package taokdao.api.ui.dialog.callback;

import android.content.DialogInterface;
import android.view.View;

import taokdao.api.ui.dialog.IDialog;

/**
 * A callback used for multi choice (check box) list dialogs.
 */
public interface ListCallbackSingleChoice {

    /**
     * Return true to allow the radio button to be checked, if the alwaysCallSingleChoice() option
     * is used.
     *
     * @param dialog The dialog of which a list item was selected.
     * @param which  The index of the item that was selected.
     * @param text   The text of the item that was selected.
     * @return True to allow the radio button to be selected.
     */
    boolean onSelection(IDialog dialog, View itemView, int which, CharSequence text);
}
