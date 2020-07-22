package taokdao.api.ui.dialog.callback;

import android.view.View;

import taokdao.api.ui.dialog.IDialog;


/**
 * A callback used for regular list dialogs.
 */
public interface ListLongCallback {

    boolean onLongSelection(IDialog dialog, View itemView, int position, CharSequence text);
}
