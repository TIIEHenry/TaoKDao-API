package taokdao.api.ui.content.editor.wrapped;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.jetbrains.annotations.NotNull;

import taokdao.api.ui.content.editor.IEditor;
import taokdao.api.ui.content.editor.base.edit.IDataController;
import taokdao.api.ui.content.editor.base.edit.ISearcher;
import taokdao.api.ui.content.editor.base.edit.IUndoManager;
import taokdao.api.ui.content.editor.base.io.IIOController;
import taokdao.api.ui.content.editor.base.select.ICursorController;
import taokdao.api.ui.content.editor.base.select.ISelector;
import taokdao.api.ui.content.editor.base.ui.IIMEController;

public class EmptyIEditor implements IEditor<Object, Integer> {

    @Nullable
    @Override
    public IUndoManager getUndoManager() {
        return null;
    }

    @Override
    public void setUndoManager(IUndoManager undoManager) {

    }

    @Nullable
    @Override
    public ISelector<Object, Integer> getSelector() {
        return null;
    }

    @Override
    public void setSelector(ISelector<Object, Integer> selector) {

    }

    @Nullable
    @Override
    public IIMEController getIMEController() {
        return null;
    }

    @Override
    public void setIMEController(IIMEController imeController) {

    }

    @Nullable
    @Override
    public ICursorController<Integer> getCursorController() {
        return null;
    }

    @Override
    public void setCursorController(ICursorController<Integer> cursorController) {

    }

    @NotNull
    @Override
    public IIOController<Object> getIOController() {
        return null;
    }

    @Override
    public void setIOController(@NotNull IIOController<Object> ioController) {

    }

    @NonNull
    @Override
    public IDataController<Object> getDataController() {
        return null;
    }

    @Override
    public void setDataController(@NotNull IDataController<Object> dataController) {

    }

    @Nullable
    @Override
    public ISearcher<Object, Integer> getSearcher() {
        return null;
    }

    @Override
    public void setSearcher(ISearcher<Object, Integer> searcher) {

    }

    @Override
    public boolean requestFocus() {
        return false;
    }
}
