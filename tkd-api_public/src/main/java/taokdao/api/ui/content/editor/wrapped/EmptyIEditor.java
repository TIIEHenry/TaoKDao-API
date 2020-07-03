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
import taokdao.api.ui.content.editor.base.theme.IUiModeManager;
import taokdao.api.ui.content.editor.base.theme.UiMode;
import taokdao.api.ui.content.editor.base.ui.IIMEController;

public interface EmptyIEditor extends IEditor<Object, Integer> {

    @Nullable
    @Override
    default IUndoManager getUndoManager() {
        return null;
    }

    @Override
    default void setUndoManager(IUndoManager undoManager) {

    }

    @Nullable
    @Override
    default ISelector<Object, Integer> getSelector() {
        return null;
    }

    @Override
    default void setSelector(ISelector<Object, Integer> selector) {

    }

    @Nullable
    @Override
    default IIMEController getIMEController() {
        return null;
    }

    @Override
    default void setIMEController(IIMEController imeController) {

    }

    @Nullable
    @Override
    default ICursorController<Integer> getCursorController() {
        return null;
    }

    @Override
    default void setCursorController(ICursorController<Integer> cursorController) {

    }

    @NotNull
    @Override
    default IIOController<Object> getIOController() {
        return null;
    }

    @Override
    default void setIOController(@NotNull IIOController<Object> ioController) {

    }

    @NonNull
    @Override
    default IDataController<Object> getDataController() {
        return null;
    }

    @Override
    default void setDataController(@NotNull IDataController<Object> dataController) {

    }

    @Nullable
    @Override
    default ISearcher<Object, Integer> getSearcher() {
        return null;
    }

    @Override
    default void setSearcher(ISearcher<Object, Integer> searcher) {

    }

    @Override
    default boolean requestFocus() {
        return false;
    }

    @NonNull
    @Override
    default IUiModeManager getUiModeManager() {
        return new IUiModeManager() {
            @Override
            public void setUiMode(UiMode mode) {

            }

            @Override
            public UiMode getUiMode() {
                return null;
            }
        };
    }
}
