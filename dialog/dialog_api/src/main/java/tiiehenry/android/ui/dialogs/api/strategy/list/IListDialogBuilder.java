package tiiehenry.android.ui.dialogs.api.strategy.list;

import androidx.annotation.NonNull;

import tiiehenry.android.ui.dialogs.api.strategy.list.custom.ICustomListDialogBuilder;
import tiiehenry.android.ui.dialogs.api.strategy.list.multi.IMultiListDialogBuilder;
import tiiehenry.android.ui.dialogs.api.strategy.list.regular.IRegularListDialogBuilder;
import tiiehenry.android.ui.dialogs.api.strategy.list.single.ISingleListDialogBuilder;

public interface IListDialogBuilder extends IRegularListDialogBuilder {
    @NonNull
    IRegularListDialogBuilder typeRegular();

    @NonNull
    ICustomListDialogBuilder typeCustom();

    @NonNull
    ISingleListDialogBuilder typeSingleChoice();

    @NonNull
    IMultiListDialogBuilder typeMultiChoice();

}
