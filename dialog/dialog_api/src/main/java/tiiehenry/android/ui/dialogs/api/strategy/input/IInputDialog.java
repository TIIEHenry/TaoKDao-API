package tiiehenry.android.ui.dialogs.api.strategy.input;

import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;

import tiiehenry.android.ui.dialogs.api.IDialog;

public interface IInputDialog extends IDialog {
    void setInputError(@Nullable String error);

    void setInputError(@StringRes int error);

    @NonNull
    EditText getInputField();
}
