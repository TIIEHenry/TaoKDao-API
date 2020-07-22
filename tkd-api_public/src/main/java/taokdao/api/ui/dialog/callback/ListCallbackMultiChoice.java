package taokdao.api.ui.dialog.callback;

import taokdao.api.ui.dialog.IDialog;


/**
 * A callback used for multi choice (check box) list dialogs.
 */
public interface ListCallbackMultiChoice {

    /**
     * Return true to allow the check box to be checked, if the alwaysCallSingleChoice() option is
     * used.
     *
     * @param dialog The dialog of which a list item was selected.
     * @param which  The indices of the items that were selected.
     * @param text   The text of the items that were selected.
     * @return True to allow the checkbox to be selected.
     */
    boolean onSelection(IDialog dialog, Integer[] which, CharSequence[] text);
}