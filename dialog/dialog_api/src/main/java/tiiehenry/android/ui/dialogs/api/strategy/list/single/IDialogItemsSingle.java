package tiiehenry.android.ui.dialogs.api.strategy.list.single;

import androidx.annotation.NonNull;

import tiiehenry.android.ui.dialogs.api.base.content.IDialogBaseItems;
import tiiehenry.android.ui.dialogs.api.callback.ListCallbackSingleChoice;

public interface IDialogItemsSingle<T> extends IDialogBaseItems<T> {


    /**
     * 设置对话框列表单选监听
     * 总是会触发，无需设置其他事件
     * Pass anything below 0 (such as -1) for the selected index to leave all options unselected
     * initially. Otherwise pass the index of an item that will be selected initially.
     *
     * @param selectedIndex The checkbox index that will be selected initially.
     * @param callback      The callback that will be called when the presses the positive button.
     * @return The Builder instance so you can chain calls to it.
     */
    T itemsCallbackSingleChoice(
            int selectedIndex, @NonNull ListCallbackSingleChoice callback);

    /**
     * By default, the single choice callback is only called when the user clicks the positive
     * button or if there are no buttons. Call this to force it to always call on item clicks even
     * if the positive button exists.
     *
     * @return The Builder instance so you can chain calls to it.
     */
    T alwaysCallSingleChoiceCallback();
}
