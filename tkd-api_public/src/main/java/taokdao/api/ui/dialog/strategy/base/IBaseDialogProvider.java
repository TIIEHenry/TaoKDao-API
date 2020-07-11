package taokdao.api.ui.dialog.strategy.base;

import androidx.annotation.NonNull;

public interface IBaseDialogProvider<T> {
    @NonNull T builder();
}
