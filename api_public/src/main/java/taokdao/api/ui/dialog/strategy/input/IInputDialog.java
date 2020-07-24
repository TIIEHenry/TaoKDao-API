package taokdao.api.ui.dialog.strategy.input;

import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import taokdao.api.ui.dialog.IDialog;

public interface IInputDialog extends IDialog {
    void setInputError(@Nullable String error);

    @NonNull
    EditText getInputEditText();
}
