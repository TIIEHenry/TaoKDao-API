package tiiehenry.android.ui.dialogs.api.strategy.list.custom;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public interface IDialogItemsCustom<T> /*extends IDialogBaseItems<T>*/ {

    /**
     * Sets a custom {@link androidx.recyclerview.widget.RecyclerView.Adapter} for the dialog's list
     *
     * @param adapter       The adapter to set to the list.
     * @param layoutManager The layout manager to use in the RecyclerView. Pass null to use the
     *                      default linear manager.
     * @return This Builder object to allow for chaining of calls to set methods
     */
    @SuppressWarnings("ConstantConditions")
    T adapter(
            @NonNull RecyclerView.Adapter<?> adapter,
            @Nullable RecyclerView.LayoutManager layoutManager);

    /**
     * LinearLayoutManager VERTICAL
     *
     * @param adapter
     * @return
     */
    T adapter(
            @NonNull RecyclerView.Adapter<?> adapter);
}