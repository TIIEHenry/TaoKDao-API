package tiiehenry.android.ui.dialogs.api.base.content;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;

import tiiehenry.android.ui.dialogs.api.callback.OnCheckedChangeListener;

public interface IDialogCheckPrompt<T> {

    T checkBoxPrompt(
            @NonNull CharSequence prompt,
            boolean initiallyChecked,
            @Nullable OnCheckedChangeListener checkListener);

    T checkBoxPromptRes(
            @StringRes int prompt,
            boolean initiallyChecked,
            @Nullable OnCheckedChangeListener checkListener);

}
