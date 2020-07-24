package taokdao.api.ui.dialog.strategy.list;

import androidx.annotation.NonNull;

import taokdao.api.ui.dialog.strategy.list.custom.ICustomListDialogBuilder;
import taokdao.api.ui.dialog.strategy.list.multi.IMultiListDialogBuilder;
import taokdao.api.ui.dialog.strategy.list.regular.IRegularListDialogBuilder;
import taokdao.api.ui.dialog.strategy.list.single.ISingleListDialogBuilder;

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
