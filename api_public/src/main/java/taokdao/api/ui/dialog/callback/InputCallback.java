package taokdao.api.ui.dialog.callback;

import androidx.annotation.NonNull;

import taokdao.api.ui.dialog.strategy.input.IInputDialog;


public interface InputCallback {

    void onInput(@NonNull IInputDialog dialog, CharSequence input);
}
