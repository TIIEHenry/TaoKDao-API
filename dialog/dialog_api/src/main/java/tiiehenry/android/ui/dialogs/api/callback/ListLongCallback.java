package tiiehenry.android.ui.dialogs.api.callback;

import android.view.View;

import tiiehenry.android.ui.dialogs.api.IDialog;


/**
 * A callback used for regular list dialogs.
 */
public interface ListLongCallback {

    boolean onLongSelection(IDialog dialog, View itemView, int position, CharSequence text);
}
