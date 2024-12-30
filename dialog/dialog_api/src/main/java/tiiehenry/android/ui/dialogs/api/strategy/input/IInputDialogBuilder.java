package tiiehenry.android.ui.dialogs.api.strategy.input;

import tiiehenry.android.ui.dialogs.api.builder.IBaseDialogBuilder;

public interface IInputDialogBuilder extends IBaseDialogBuilder<IInputDialogBuilder>, IDialogInput<IInputDialogBuilder> {

    @Override
    IInputDialog build();

    @Override
    default IInputDialog show() {
        IInputDialog dialog = build();
        dialog.show();
        return dialog;
    }

}
