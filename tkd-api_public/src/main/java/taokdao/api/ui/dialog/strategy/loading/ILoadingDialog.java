package taokdao.api.ui.dialog.strategy.loading;

import androidx.annotation.Nullable;

public interface ILoadingDialog {

    void setLoadingText(@Nullable CharSequence text);

    void executeLoadingTask();
}
