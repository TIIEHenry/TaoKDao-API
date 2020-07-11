package taokdao.api.ui.dialog.strategy.list.regular;

import androidx.annotation.NonNull;

import taokdao.api.ui.dialog.callback.ListCallback;
import taokdao.api.ui.dialog.callback.ListLongCallback;
import taokdao.api.ui.dialog.base.content.IDialogBaseItems;

public  interface IDialogItemsRegular<T> extends IDialogBaseItems<T> {
    /**
     * 设置对话框列表的点击回调
     *
     * @param callback
     * @return
     */
    T itemsCallback(@NonNull ListCallback callback);

    /**
     * 设置对话框列表的长按点击回调
     *
     * @param callback
     * @return
     */
    T itemsLongCallback(@NonNull ListLongCallback callback);
}
