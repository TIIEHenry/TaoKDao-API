package tiiehenry.android.ui.dialogs.api.callback;

import tiiehenry.android.ui.dialogs.api.IDialog;

/**
 * A callback used for regular list dialogs.
 */
public interface ListCallback {

    void onSelection(IDialog dialog, int position, String text);
}