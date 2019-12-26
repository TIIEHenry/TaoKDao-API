package androcode.api.editor;

import android.view.View;

import androcode.api.editor.edit.LineEditable;
import androcode.api.editor.edit.RegionEditable;
import androcode.api.editor.edit.TextEditable;
import androcode.api.editor.format.Formattable;
import androcode.api.editor.io.IOManager;
import androcode.api.editor.select.Selectable;
import androcode.api.editor.theme.EditorTheme;
import androcode.api.editor.ui.IIMEControl;
import androcode.api.editor.undo.Undoable;

public interface IEditor extends TextEditable, Undoable, Formattable, Selectable, LineEditable, RegionEditable, IIMEControl {
    //获取EditorView
    View getView();


    /**
     * 是否支持撤销重做
     */
    boolean isUndoable();

    IOManager getIOManager();

    void onThemeChanged(EditorTheme theme);//主题切换
//    void setDark(boolean isDark);

    boolean requestFocus();

    /**
     * 非工程下运行
     *
     * @return false-调用FileBuilder,true-编辑器处理
     */
    boolean runFile();

    /**
     * 非工程下构建
     *
     * @return false-调用FileBuilder,true-编辑器处理
     */
    boolean buildFile();
}
