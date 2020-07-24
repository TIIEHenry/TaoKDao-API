package taokdao.api.ui.content.editor.base.select;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface ISelector<D, I> {


    /**
     * 缩选
     */
    void selectLess();

    /**
     * 扩选
     */
    void selectMore();

    /**
     * 全选
     */
    void selectAll();


    /**
     * @return 不在selectionMode时为null
     */
    @Nullable
    ISelection<I> getSelection();

    void setSelection(@Nullable ISelection<I> selection);

    @Nullable
    D getSelectionData(@NonNull ISelection<I> selection);

    void setSelectionData(@NonNull ISelection<I> selection, @NonNull D data);

    @Nullable
    D getSelectedData();

    @Nullable
    D cutSelectedData();

    @Nullable
    D deleteSelectedData();

    @Nullable
    D copySelectedData();

}
