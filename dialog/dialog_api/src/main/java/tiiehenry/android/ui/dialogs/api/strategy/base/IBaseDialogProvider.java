package tiiehenry.android.ui.dialogs.api.strategy.base;

import androidx.annotation.NonNull;

public interface IBaseDialogProvider<T> {
    @NonNull
    T builder();
}
