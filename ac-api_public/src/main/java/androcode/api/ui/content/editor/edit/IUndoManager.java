package androcode.api.ui.content.editor.edit;

public interface IUndoManager {

    void undo(int count);

    void undo();

    /**
     * 撤销多次或者长距离
     */
    void undoMore();

    void redo(int count);

    void redo();

    /**
     * 重做多次或者长距离
     */
    void redoMore();
}
