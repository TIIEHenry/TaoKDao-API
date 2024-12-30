package tiiehenry.android.ui.dialogs.api.base.head;

import android.graphics.drawable.Drawable;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;

public interface IDialogIcon<T> {

    /**
     * 设置对话框的图标
     *
     * @param icon
     * @return
     */
    T icon(@NonNull Drawable icon);

    T iconRes(@DrawableRes int iconRes);

//    T iconAttr(@AttrRes int iconAttr);

    /**
     * Limits the display size of a set icon to 40dp.
     */
    T limitIconToDefaultSize();

}
