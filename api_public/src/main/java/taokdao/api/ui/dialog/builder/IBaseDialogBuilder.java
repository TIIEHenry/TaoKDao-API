package taokdao.api.ui.dialog.builder;

import androidx.annotation.Nullable;
import androidx.annotation.UiThread;

import taokdao.api.ui.dialog.IDialog;
import taokdao.api.ui.dialog.base.button.IDialogButtons;
import taokdao.api.ui.dialog.base.head.IDialogIcon;
import taokdao.api.ui.dialog.base.head.IDialogTitle;
import taokdao.api.ui.dialog.base.window.IDialogCancelable;
import taokdao.api.ui.dialog.base.window.IDialogListener;

public interface IBaseDialogBuilder<T>
        extends IDialogListener<T>, IDialogCancelable<T>
        , IDialogIcon<T>, IDialogTitle<T>, IDialogButtons<T> {

    T builder();

    @UiThread
    IDialog build();

    @UiThread
    default IDialog show() {
        IDialog dialog = build();
        dialog.show();
        return dialog;
    }

    T tag(@Nullable Object tag);

}
