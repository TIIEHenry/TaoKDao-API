package taokdao.api.ui.dialog.strategy.input;

import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;

import taokdao.api.ui.dialog.builder.IBaseDialogBuilder;
import taokdao.api.ui.dialog.callback.InputCallback;


public interface IDialogInput<T> extends IBaseDialogBuilder<T> {


    /**
     * 设置对话框输入框的样式
     *
     * @param hint
     * @param preFill
     * @param callback
     * @return
     */
    T input(
            @Nullable CharSequence hint,
            @Nullable CharSequence preFill,
            @NonNull InputCallback callback);


    T input(
            @StringRes int hint,
            @StringRes int preFill,
            @NonNull InputCallback callback);

    T allowEmptyInput(boolean allow);

    T inputType(int type);

    T inputRange(
            @IntRange(from = 0, to = Integer.MAX_VALUE) int minLength,
            @IntRange(from = -1, to = Integer.MAX_VALUE) int maxLength);

    /**
     * @param errorColor Pass in 0 for the default red error color (as specified in guidelines).
     */
    T inputRange(
            @IntRange(from = 0, to = Integer.MAX_VALUE) int minLength,
            @IntRange(from = -1, to = Integer.MAX_VALUE) int maxLength,
            @ColorInt int errorColor);

    /**
     * Same as #{@link #inputRange(int, int, int)}, but it takes a color resource ID for the error
     * color.
     */
    T inputRangeRes(
            @IntRange(from = 0, to = Integer.MAX_VALUE) int minLength,
            @IntRange(from = -1, to = Integer.MAX_VALUE) int maxLength,
            @ColorRes int errorColor);

    T alwaysCallInputCallback(boolean isCall);
}
