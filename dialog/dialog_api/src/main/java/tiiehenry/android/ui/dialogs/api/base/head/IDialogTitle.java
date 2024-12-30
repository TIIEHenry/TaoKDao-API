package tiiehenry.android.ui.dialogs.api.base.head;

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
//
//    /**
//     * 设置标题的对齐方式
//     *
//     * @param gravity
//     * @return
//     */
//    T titleGravity(@NonNull GravityEnum gravity);
}
