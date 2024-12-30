package tiiehenry.android.ui.dialogs.api.base.content;

import android.view.View;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import tiiehenry.android.ui.dialogs.api.callback.OnViewCreatedCallback;

public interface IDialogCustom<T> {
    /**
     * 设置对话框自定义布局
     *
     * @param layoutRes
     * @param dialogWrapContent
     * @param onViewCreatedCallback call after inflate view
     * @return
     */
    T customView(@LayoutRes int layoutRes, boolean dialogWrapContent, @Nullable OnViewCreatedCallback onViewCreatedCallback);

    default T customView(@LayoutRes int layoutRes, boolean dialogWrapContent) {
        return customView(layoutRes, dialogWrapContent, null);
    }

    T customView(@NonNull View view, boolean dialogWrapContent);

}
