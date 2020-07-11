package taokdao.api.ui.dialog.callback;

import android.content.DialogInterface;

import androidx.annotation.NonNull;

import taokdao.api.ui.dialog.IDialog;
import taokdao.api.ui.dialog.strategy.input.IInputDialog;


public interface InputCallback {

    void onInput(@NonNull IInputDialog dialog, CharSequence input);
}
