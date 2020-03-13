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

public class EmptyIEditor implements IEditor<Object, Integer> {

    @Nullable
    @Override
    public IUndoManager getUndoManager() {
        return null;
    }


    @Nullable
    @Override
    public IBlockEditor getBlockEditor() {
        return null;
    }

    @Nullable
    @Override
    public ISelector<Object, Integer> getSelector() {
        return null;
    }

    @Nullable
    @Override
    public IIMEController getIMEController() {
        return null;
    }

    @Nullable
    @Override
    public ICursorController<Integer> getCursorController() {
        return null;
    }

    @Nullable
    @Override
    public IIOManager<Object> getIOManager() {
        return null;
    }

    @NonNull
    @Override
    public IDataController<Object> getDataController() {
        return null;
    }

    @Nullable
    @Override
    public ISearcher<Object, Integer> getSearcher() {
        return null;
    }

    @Override
    public boolean requestFocus() {
        return false;
    }
}
