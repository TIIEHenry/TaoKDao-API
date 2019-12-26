package androcode.api.editor.undo;

public interface Undoable {

    void undo(int count);

    void undo();

    void redo(int count);

    void redo();
}
