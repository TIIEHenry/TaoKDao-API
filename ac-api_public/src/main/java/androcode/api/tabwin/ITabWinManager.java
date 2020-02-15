package androcode.api.tabwin;

import androidx.annotation.Nullable;

import java.io.File;
import java.util.List;
import java.util.Set;

import androcode.api.editor.IEditor;
import androcode.api.explorer.FileOpener;

public interface ITabWinManager {
    void onCreate();

    void closeCurrent();

    void closeOther();

    void closeAll();

    void closeAlltotheLeft();

    void closeAlltotheRight();

    void addTabWin(TabWin tabWin, boolean selectNewWin);

    /**
     * selectNewWin true
     */
    void addTabWin(TabWin tabWin);

    void removeTabWin(TabWin tabWin);

    boolean selectTabWin(TabWin tabWin);

    boolean selectTabWin(String path);

    boolean selectTabWin(int index);

    @Nullable
    IEditor getCurrentEditor();

    @Nullable
    String getCurrentPath();

    List<TabWin> getTabWinList();

    void openNew(String path);

    boolean isFileOpened(String path);

    //    void setCurrentEditor(IEditor editor);
    void showOpenerChooserDialog(Set<FileOpener> set, File file);
}
