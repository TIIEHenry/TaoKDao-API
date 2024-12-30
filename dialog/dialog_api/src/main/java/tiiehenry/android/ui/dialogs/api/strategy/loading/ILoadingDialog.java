package tiiehenry.android.ui.dialogs.api.strategy.loading;

import androidx.annotation.Nullable;

import tiiehenry.android.ui.dialogs.api.IDialog;

public interface ILoadingDialog extends IDialog {

    void setLoadingText(@Nullable CharSequence text);

    void executeLoadingTask();
}
