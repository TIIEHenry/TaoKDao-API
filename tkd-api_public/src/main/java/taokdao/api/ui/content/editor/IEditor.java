package taokdao.api.ui.content.editor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import taokdao.api.ui.content.editor.base.edit.IBlockEditor;
import taokdao.api.ui.content.editor.base.edit.IDataController;
import taokdao.api.ui.content.editor.base.edit.ISearcher;
import taokdao.api.ui.content.editor.base.edit.IUndoManager;
import taokdao.api.ui.content.editor.base.io.IIOManager;
import taokdao.api.ui.content.editor.base.select.ICursorController;
import taokdao.api.ui.content.editor.base.select.ISelector;
import taokdao.api.ui.content.editor.base.ui.IIMEController;

/**
 * @param <D> 数据形式
 * @param <I> 位置的类型
 */
public interface IEditor<D, I> {

    /**
     * @return 数据管理
     */
    @NonNull
    IDataController<D> getDataController();

    /**
     * @return 数据输入输出管理
     */
    @Nullable
    IIOManager<D> getIOManager();

    /**
     * @return 撤销重做管理器
     */
    @Nullable
    IUndoManager getUndoManager();

    /**
     * @return 位置控制器
     */
    @Nullable
    ICursorController<I> getCursorController();

    /**
     * @return 块编辑器
     */
    @Nullable
    IBlockEditor getBlockEditor();


    /**
     * @return 选择器
     */
    @Nullable
    ISelector<D, I> getSelector();

    /**
     * @return 输入法控制器
     */
    @Nullable
    IIMEController getIMEController();

    /**
     * @return 搜索工具
     */
    @Nullable
    ISearcher<D, I> getSearcher();
//
//    /**
//     * @return 主题管理器
//     */
//    @Nullable
//    IThemeManager getThemeManager();

    boolean requestFocus();

}
