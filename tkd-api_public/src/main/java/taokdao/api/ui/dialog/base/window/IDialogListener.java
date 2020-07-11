package taokdao.api.ui.dialog.base.window;

import androidx.annotation.NonNull;

import taokdao.api.ui.dialog.callback.OnCancelListener;
import taokdao.api.ui.dialog.callback.OnDismissListener;
import taokdao.api.ui.dialog.callback.OnKeyListener;
import taokdao.api.ui.dialog.callback.OnShowListener;

public interface IDialogListener<T> {


    /**
     * 设置对话框的显示监听
     *
     * @param listener
     * @return
     */
    T showListener(@NonNull OnShowListener listener);

    /**
     * 设置对话框的消失监听
     *
     * @param listener
     * @return
     */
    T dismissListener(@NonNull OnDismissListener listener);

    /**
     * 设置对话框的取消监听
     *
     * @param listener
     * @return
     */
    T cancelListener(@NonNull OnCancelListener listener);

    T keyListener(@NonNull OnKeyListener listener);

}
