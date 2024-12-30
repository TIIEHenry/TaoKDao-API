package tiiehenry.android.ui.dialogs.api.builder;

import androidx.annotation.UiThread;

import tiiehenry.android.ui.dialogs.api.IDialog;
import tiiehenry.android.ui.dialogs.api.base.button.IDialogButtons;
import tiiehenry.android.ui.dialogs.api.base.content.IDialogCheckPrompt;
import tiiehenry.android.ui.dialogs.api.base.head.IDialogIcon;
import tiiehenry.android.ui.dialogs.api.base.head.IDialogTitle;
import tiiehenry.android.ui.dialogs.api.base.window.IDialogCancelable;
import tiiehenry.android.ui.dialogs.api.base.window.IDialogListener;

public interface IBaseDialogBuilder<T>
        extends IDialogListener<T>, IDialogCancelable<T>
        , IDialogIcon<T>, IDialogTitle<T>, IDialogButtons<T>, IDialogCheckPrompt<T> {

    T builder();

    @UiThread
    IDialog build();

    @UiThread
    default IDialog show() {
        IDialog dialog = build();
        dialog.show();
        return dialog;
    }

//    T tag(@Nullable Object tag);

}
