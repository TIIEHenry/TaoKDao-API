package taokdao.api.ui.content.editor.wrapped;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import taokdao.api.ui.content.editor.IEditor;
import taokdao.api.ui.content.editor.base.edit.IBlockEditor;
import taokdao.api.ui.content.editor.base.edit.IDataController;
import taokdao.api.ui.content.editor.base.edit.ISearcher;
import taokdao.api.ui.content.editor.base.edit.IUndoManager;
import taokdao.api.ui.content.editor.base.io.IIOManager;
import taokdao.api.ui.content.editor.base.select.ICursorController;
import taokdao.api.ui.content.editor.base.select.ISelector;
import taokdao.api.ui.content.editor.base.ui.IIMEController;

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
