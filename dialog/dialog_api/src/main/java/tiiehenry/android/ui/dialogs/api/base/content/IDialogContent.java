package tiiehenry.android.ui.dialogs.api.base.content;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;


public interface IDialogContent<T> {

    /**
     * 设置对话框的内容
     *
     * @param contentRes
     * @return
     */
    T content(@StringRes int contentRes);

//    T content(@StringRes int contentRes, boolean html);

    /**
     * 设置对话框的内容
     *
     * @param content
     * @return
     */
    T content(@NonNull CharSequence content);


//    T content(@StringRes int contentRes, Object... formatArgs);

}
