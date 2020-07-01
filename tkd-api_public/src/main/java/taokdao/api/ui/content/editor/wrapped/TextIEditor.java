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

public class TextIEditor implements IEditor<String, Integer> {

    @NonNull
    @Override
    public IDataController<String> getDataController() {
        return null;
    }

    @Override
    public void setDataController(@NotNull IDataController<String> dataController) {

    }

    @NotNull
    @Override
    public IIOController<String> getIOController() {
        return null;
    }

    @Override
    public void setIOController(@NotNull IIOController<String> ioController) {

    }

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
    public ICursorController<Integer> getCursorController() {
        return null;
    }

    @Override
    public void setCursorController(ICursorController<Integer> cursorController) {

    }

    @Nullable
    @Override
    public ISelector<String, Integer> getSelector() {
        return null;
    }

    @Override
    public void setSelector(ISelector<String, Integer> selector) {

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
    public ISearcher<String, Integer> getSearcher() {
        return null;
    }

    @Override
    public void setSearcher(ISearcher<String, Integer> searcher) {

    }

    @Override
    public boolean requestFocus() {
        return true;
    }
}
