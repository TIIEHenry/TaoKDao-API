package taokdao.api.ui.content.editor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import taokdao.api.ui.content.editor.base.edit.IDataController;
import taokdao.api.ui.content.editor.base.edit.ISearcher;
import taokdao.api.ui.content.editor.base.edit.IUndoManager;
import taokdao.api.ui.content.editor.base.io.IIOController;
import taokdao.api.ui.content.editor.base.select.ICursorController;
import taokdao.api.ui.content.editor.base.select.ISelector;
import taokdao.api.ui.content.editor.base.theme.IUiModeManager;
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

    void setDataController(@NonNull IDataController<D> dataController);

    /**
     * @return 数据输入输出管理
     */
    @NonNull
    IIOController<D> getIOController();

    void setIOController(@NonNull IIOController<D> ioController);

    /**
     * @return 撤销重做管理器
     */
    @Nullable
    IUndoManager getUndoManager();

    void setUndoManager(@Nullable IUndoManager undoManager);

    /**
     * @return 位置控制器
     */
    @Nullable
    ICursorController<I> getCursorController();

    void setCursorController(@Nullable ICursorController<I> cursorController);

    /**
     * @return 选择器
     */
    @Nullable
    ISelector<D, I> getSelector();

    void setSelector(@Nullable ISelector<D, I> selector);

    /**
     * @return 输入法控制器
     */
    @Nullable
    IIMEController getIMEController();

    void setIMEController(@Nullable IIMEController imeController);

    /**
     * @return 搜索工具
     */
    @Nullable
    ISearcher<D, I> getSearcher();

    void setSearcher(@Nullable ISearcher<D, I> searcher);
//
    /**
     * @return 主题管理器
     */
    @NonNull
    IUiModeManager getUiModeManager();

    boolean requestFocus();

}
