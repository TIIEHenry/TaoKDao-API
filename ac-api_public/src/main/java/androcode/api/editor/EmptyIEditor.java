package androcode.api.editor;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androcode.api.editor.edit.IBlockEditor;
import androcode.api.editor.edit.IDataManager;
import androcode.api.editor.edit.ISearcher;
import androcode.api.editor.io.IIOManager;
import androcode.api.editor.select.ICursorController;
import androcode.api.editor.select.ISelector;
import androcode.api.editor.ui.IIMEController;
import androcode.api.editor.edit.IUndoManager;

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
    public IDataManager<Object> getDataManager() {
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
