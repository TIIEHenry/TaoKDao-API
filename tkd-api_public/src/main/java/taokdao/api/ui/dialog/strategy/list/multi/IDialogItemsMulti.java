package taokdao.api.ui.dialog.strategy.list.multi;

import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;

import taokdao.api.ui.dialog.callback.ListCallbackMultiChoice;
import taokdao.api.ui.dialog.base.content.IDialogBaseItems;

public interface IDialogItemsMulti<T> extends IDialogBaseItems<T> {
    T checkBoxPrompt(
            @NonNull CharSequence prompt,
            boolean initiallyChecked,
            @Nullable CheckBox.OnCheckedChangeListener checkListener);

    T checkBoxPromptRes(
            @StringRes int prompt,
            boolean initiallyChecked,
            @Nullable CheckBox.OnCheckedChangeListener checkListener);

    /**
     * 设置对话框列表多选监听
     * Pass null for the selected indices to leave all options unselected initially. Otherwise pass
     * an array of indices that will be selected initially.
     *
     * @param selectedIndices The radio button indices that will be selected initially.
     * @param callback        The callback that will be called when the presses the positive button.
     * @return The Builder instance so you can chain calls to it.
     */
    T itemsCallbackMultiChoice(
            @Nullable Integer[] selectedIndices, @NonNull ListCallbackMultiChoice callback);


    /**
     * By default, the multi choice callback is only called when the user clicks the positive button
     * or if there are no buttons. Call this to force it to always call on item clicks even if the
     * positive button exists.
     *
     * @return The Builder instance so you can chain calls to it.
     */
    T alwaysCallMultiChoiceCallback();
}
