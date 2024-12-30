package tiiehenry.android.ui.dialogs.api.callback;

import androidx.annotation.NonNull;

import tiiehenry.android.ui.dialogs.api.strategy.input.IInputDialog;


public interface InputCallback {

    void onInput(@NonNull IInputDialog dialog, CharSequence input);
}
