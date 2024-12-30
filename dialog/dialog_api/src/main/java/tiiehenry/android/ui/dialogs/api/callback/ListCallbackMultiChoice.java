package tiiehenry.android.ui.dialogs.api.callback;

import tiiehenry.android.ui.dialogs.api.IDialog;


/**
 * A callback used for multi choice (check box) list dialogs.
 */
public interface ListCallbackMultiChoice {

    /**
     * Return true to allow the check box to be checked, if the alwaysCallSingleChoice() option is
     * used.
     *
     * @param dialog  The dialog of which a list item was selected.
     * @param indices The indices of the items that were selected.
     * @param items   The text of the items that were selected.
     * @return True to allow the checkbox to be selected.
     */
    boolean onSelection(IDialog dialog, int[] indices, CharSequence[] items);
}