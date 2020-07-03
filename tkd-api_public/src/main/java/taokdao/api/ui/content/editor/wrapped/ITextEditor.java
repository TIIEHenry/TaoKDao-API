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

public interface ITextEditor extends IEditor<String, Integer> {

}
