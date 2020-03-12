package androcode.api.ui.content.editor.select;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface ISelector<D, I> {

    /**
     * 全选
     */
    void selectAll();

    /**
     * 缩选
     */
    void selectLess();

    /**
     * 扩选
     */
    void selectMore();

    /**
     * @return 不在selectionMode时为null
     */
    @Nullable
    ISelection<I> getSelection();

    void setSelection(@Nullable ISelection<I> selection);

    D getDataForSelection(@NonNull ISelection<I> selection);

    D getSelectedData();

    D cutSelection();

    D deleteSelection();

    D copySelection();

    void replaceSelection(@NonNull ISelection<I> selection, @NonNull D data);


//    /**
//     * 注释选择文本
//     */
//    public void noteRegion();
//
//    public void noteRegion(int selStart, int selEnd);
//
//    /**
//     * 文档注释选择文本
//     */
//    public void noteDocRegion();
//
//    public void noteDocRegion(int selStart, int selEnd);
}
