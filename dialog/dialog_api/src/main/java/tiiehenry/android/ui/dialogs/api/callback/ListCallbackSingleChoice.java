package tiiehenry.android.ui.dialogs.api.callback;

import tiiehenry.android.ui.dialogs.api.IDialog;

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
    boolean onSelection(IDialog dialog, int which, CharSequence text);
}
