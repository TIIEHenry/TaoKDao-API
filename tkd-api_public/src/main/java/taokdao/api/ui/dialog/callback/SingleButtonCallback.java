package taokdao.api.ui.dialog.callback;

import android.content.DialogInterface;

import androidx.annotation.NonNull;


import taokdao.api.ui.dialog.DialogAction;
import taokdao.api.ui.dialog.IDialog;


public interface SingleButtonCallback {

    default void onPositive(@NonNull IDialog dialog) {
        onClick(dialog, DialogAction.POSITIVE);
    }

    default void onNegative(@NonNull IDialog dialog) {
        onClick(dialog, DialogAction.NEGATIVE);
    }

    default void onNeutral(@NonNull IDialog dialog) {
        onClick(dialog, DialogAction.NEUTRAL);
    }

    void onClick(@NonNull IDialog dialog, @NonNull DialogAction which);
}