package taokdao.api.ui.content.editor.wrapped;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.IOException;

import taokdao.api.ui.content.editor.IEditor;
import taokdao.api.ui.content.editor.base.edit.IDataController;
import taokdao.api.ui.content.editor.base.edit.ISearcher;
import taokdao.api.ui.content.editor.base.edit.IUndoManager;
import taokdao.api.ui.content.editor.base.io.IIOController;
import taokdao.api.ui.content.editor.base.select.ICursorController;
import taokdao.api.ui.content.editor.base.select.ISelector;
import taokdao.api.ui.content.editor.base.ui.IIMEController;
import taokdao.api.ui.content.editor.base.ui.IUiModeManager;
import taokdao.api.ui.content.editor.base.ui.UiMode;

public interface IEmptyEditor extends IEditor<Object, Integer> {

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

    @NonNull
    @Override
    default IIOController<Object> getIOController() {
        return new IIOController<Object>() {
            @Override
            public void setReadable(boolean readable) {

            }

            @Override
            public boolean canRead() {
                return false;
            }

            @Override
            public void setWritable(boolean writable) {

            }

            @Override
            public boolean canWrite() {
                return false;
            }

            @Nullable
            @Override
            public String getCurrentPath() {
                return null;
            }

            @Override
            public void setCurrentPath(@Nullable String path) {

            }

            @Override
            public boolean open(@NonNull String path) {
                return false;
            }

            @NonNull
            @Override
            public Object read() throws IOException {
                return "";
            }

            @Override
            public void importData(@NonNull Object data) throws Exception {

            }

            @NonNull
            @Override
            public Object exportData() throws Exception {
                return "";
            }

            @Override
            public void write(@NonNull Object data) throws IOException {

            }

            @Override
            public void writeTo(@NonNull Object data, @NonNull String path) throws IOException {

            }

            @Override
            public boolean close() {
                return false;
            }
        };
    }

    @Override
    default void setIOController(@NonNull IIOController<Object> ioController) {

    }

    @NonNull
    @Override
    default IDataController<Object> getDataController() {
        return new IDataController<Object>() {
            @Override
            public Object getData() {
                return null;
            }

            @Override
            public void setData(Object s) {

            }

            @Override
            public boolean isChanged() {
                return false;
            }

            @Override
            public void setChanged(boolean changed) {

            }
        };
    }

    @Override
    default void setDataController(@NonNull IDataController<Object> dataController) {

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
            public UiMode getUiMode() {
                return UiMode.UI_MODE_NIGHT_NO;
            }

            @Override
            public void setUiMode(UiMode mode) {

            }
        };
    }
}
