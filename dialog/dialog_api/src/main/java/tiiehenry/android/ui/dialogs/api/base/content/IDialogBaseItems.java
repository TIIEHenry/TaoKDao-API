package tiiehenry.android.ui.dialogs.api.base.content;

import androidx.annotation.ArrayRes;
import androidx.annotation.NonNull;

import java.util.Collection;
import java.util.List;


public interface IDialogBaseItems<T> {

    /**
     * 设置对话框列表内容的集合
     *
     * @param itemCollection
     * @return
     */
    T items(@NonNull Collection<CharSequence> itemCollection);

    T items(@NonNull List<CharSequence> itemCollection);

    T items(@NonNull CharSequence... items);

    T items(@ArrayRes int itemsRes);


//    T itemsGravity(@NonNull GravityEnum gravity);

    /**
     * R.string.xxx,R.string.xxx
     *
     * @param idsArray int[]{R.string.xxx,R.string.xxx}
     * @return
     */
    T items(@NonNull int[] idsArray);

//    T itemsIds(@ArrayRes int idsArrayRes);

    /**
     * Sets indices of items that are not clickable. If they are checkboxes or radio buttons, they
     * will not be toggleable.
     *
     * @param disabledIndices The item indices that will be disabled from selection.
     * @return The Builder instance so you can chain calls to it.
     */
    T itemsDisabledIndices(int... disabledIndices);

//
//    /**
//     * 设置对话框列表的点击效果
//     *
//     * @param selectorRes
//     * @return
//     */
//    T listSelector(@DrawableRes int selectorRes);


}
