package androcode.api.editor;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androcode.api.editor.edit.ILineEditor;
import androcode.api.editor.edit.IBlockEditor;
import androcode.api.editor.edit.IDataManager;
import androcode.api.editor.edit.ISearcher;
import androcode.api.editor.io.IIOManager;
import androcode.api.editor.select.ICursorController;
import androcode.api.editor.select.ISelector;
import androcode.api.editor.ui.IIMEController;
import androcode.api.editor.edit.IUndoManager;

/**
 * @param <D> 数据形式
 * @param <I> 位置的类型
 */
public interface IEditor<D, I> {

    /**
     * 获取显示的布局
     */
    @NonNull
    View getView();

    /**
     * @return 撤销重做管理器
     */
    @Nullable
    IUndoManager getUndoManager();

    /**
     * @return 格式化工具
     */
    @Nullable
    IFormatter<D> getFormatter();

    /**
     * @return 行编辑器
     */
    @Nullable
    ILineEditor<D> getLineEditor();

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
    IDataManager<D> getDataManager();

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

//    /**
//     * 非工程下运行
//     *
//     * @return false-调用FileBuilder,true-编辑器处理
//     */
//    boolean runFile();
//
//    /**
//     * 非工程下构建
//     *
//     * @return false-调用FileBuilder,true-编辑器处理
//     */
//    boolean buildFile();
}
