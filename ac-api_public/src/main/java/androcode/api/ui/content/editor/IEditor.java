package androcode.api.ui.content.editor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androcode.api.ui.content.editor.edit.IBlockEditor;
import androcode.api.ui.content.editor.edit.IDataController;
import androcode.api.ui.content.editor.edit.ISearcher;
import androcode.api.ui.content.editor.edit.IUndoManager;
import androcode.api.ui.content.editor.io.IIOManager;
import androcode.api.ui.content.editor.select.ICursorController;
import androcode.api.ui.content.editor.select.ISelector;
import androcode.api.ui.content.editor.ui.IIMEController;

/**
 * @param <D> 数据形式
 * @param <I> 位置的类型
 */
public interface IEditor<D, I> {

    /**
     * @return 撤销重做管理器
     */
    @Nullable
    IUndoManager getUndoManager();


    /**
     * @return 块编辑器
     */
    @Nullable
    IBlockEditor getBlockEditor();

//    /**
//     * @return 属性
//     */
//    @Nullable
//    IEditorProperties getProperties();

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
     * @return 位置控制器
     */
    @Nullable
    ICursorController<I> getCursorController();

    /**
     * @return 数据输入输出管理
     */
    @Nullable
    IIOManager<D> getIOManager();

    /**
     * @return 数据管理
     */
    @NonNull
    IDataController<D> getDataManager();

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
