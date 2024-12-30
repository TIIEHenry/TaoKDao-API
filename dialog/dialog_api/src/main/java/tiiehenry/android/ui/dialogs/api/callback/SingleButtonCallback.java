package tiiehenry.android.ui.dialogs.api.callback;

import androidx.annotation.NonNull;

import tiiehenry.android.ui.dialogs.api.DialogAction;
import tiiehenry.android.ui.dialogs.api.IDialog;


public interface SingleButtonCallback {

    void onClick(@NonNull IDialog dialog, @NonNull DialogAction which);
}