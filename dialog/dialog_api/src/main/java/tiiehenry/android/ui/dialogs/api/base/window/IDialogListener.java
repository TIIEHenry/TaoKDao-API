package tiiehenry.android.ui.dialogs.api.base.window;

import androidx.annotation.NonNull;

import tiiehenry.android.ui.dialogs.api.callback.OnCancelListener;
import tiiehenry.android.ui.dialogs.api.callback.OnDismissListener;
import tiiehenry.android.ui.dialogs.api.callback.OnKeyListener;
import tiiehenry.android.ui.dialogs.api.callback.OnShowListener;

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
