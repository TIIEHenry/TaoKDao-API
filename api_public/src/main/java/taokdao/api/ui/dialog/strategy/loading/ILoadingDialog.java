package taokdao.api.ui.dialog.strategy.loading;

import androidx.annotation.Nullable;

import taokdao.api.ui.dialog.IDialog;

public interface ILoadingDialog extends IDialog {

    void setLoadingText(@Nullable CharSequence text);

    void executeLoadingTask();
}
