package androcode.api.editor.listener;

public interface StateChangeable {
    void setTextChangeListener(OnTextChangeListener listener);

    void setSelectionChangedListener(OnSelectionChangedListener listener);

    void setRowChangedListener(OnRowChangedListener listener);

    void setKeyShortcutListener(OnKeyShortcutListener listener);

    void setEditedChangedListener(OnEditedChangedListener listener);
}
