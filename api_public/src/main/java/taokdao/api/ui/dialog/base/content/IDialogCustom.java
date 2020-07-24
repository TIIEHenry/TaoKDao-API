package taokdao.api.ui.dialog.base.content;

import android.view.View;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import taokdao.api.ui.dialog.callback.OnViewCreatedCallback;

public interface IDialogCustom<T> {
    /**
     * 设置对话框自定义布局
     *
     * @param layoutRes
     * @param wrapInScrollView
     * @param onViewCreatedCallback call after inflate view
     * @return
     */
    T customView(@LayoutRes int layoutRes, boolean wrapInScrollView, @Nullable OnViewCreatedCallback onViewCreatedCallback);

    default T customView(@LayoutRes int layoutRes, boolean wrapInScrollView) {
        return customView(layoutRes, wrapInScrollView, null);
    }

    T customView(@NonNull View view, boolean wrapInScrollView);

}
