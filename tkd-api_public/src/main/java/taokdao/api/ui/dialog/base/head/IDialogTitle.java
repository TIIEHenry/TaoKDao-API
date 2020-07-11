package taokdao.api.ui.dialog.base.head;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;


public interface IDialogTitle<T> {

    T title(@StringRes int textRes);

    /**
     * 设置标题
     *
     * @param title
     * @return
     */
    T title(@NonNull CharSequence title);

}
