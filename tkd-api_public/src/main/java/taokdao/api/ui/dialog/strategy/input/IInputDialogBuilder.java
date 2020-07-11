package taokdao.api.ui.dialog.strategy.input;

import taokdao.api.ui.dialog.IDialog;
import taokdao.api.ui.dialog.builder.IBaseDialogBuilder;

public interface IInputDialogBuilder extends IBaseDialogBuilder<IInputDialogBuilder>, IDialogInput<IInputDialogBuilder> {

    @Override
    IInputDialog build();

    @Override
    default IInputDialog show() {
        IInputDialog dialog= build();
        dialog.show();
        return dialog;
    }
}
