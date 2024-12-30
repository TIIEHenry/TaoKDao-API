package tiiehenry.android.ui.dialogs.api.strategy.list.regular;

import androidx.annotation.NonNull;

import tiiehenry.android.ui.dialogs.api.base.content.IDialogBaseItems;
import tiiehenry.android.ui.dialogs.api.callback.ListCallback;

public interface IDialogItemsRegular<T> extends IDialogBaseItems<T> {
    /**
     * 设置对话框列表的点击回调
     *
     * @param callback
     * @return
     */
    T itemsCallback(@NonNull ListCallback callback);
//
//    /**
//     * 设置对话框列表的长按点击回调
//     *
//     * @param callback
//     * @return
//     */
//    T itemsLongCallback(@NonNull ListLongCallback callback);
}
