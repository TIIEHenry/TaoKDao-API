package androcode.api.main.content;

import androidx.annotation.Nullable;

import java.util.LinkedHashMap;
import java.util.List;

import androcode.api.editor.IEditor;
import androcode.api.explorer.FileOpener;

public interface ITabWinManager {
    void onCreate();

    void closeCurrent();

    void closeOther();

    void closeAll();

    void closeAlltotheLeft();

    void closeAlltotheRight();

    void addTabWin(TabWin tabWin, boolean selectNewWin, FileOpener opener);

    /**
     * selectNewWin true
     */
    void addTabWin(TabWin tabWin, FileOpener opener);

    void removeTabWin(TabWin tabWin);

    boolean selectTabWin(TabWin tabWin);

    boolean selectTabWin(String path);

    boolean selectTabWin(int index);

    @Nullable
    TabWin getCurrentTabWin();

    @Nullable
    IEditor getCurrentEditor();

    @Nullable
    String getCurrentPath();

    List<TabWin> getTabWinList();

    boolean openNew(String path);

    boolean openNew(String path,String opener);

    List<String> getOpenedFilePaths();


    LinkedHashMap<String, FileOpener> getPathOpenerMap();

    boolean isFileOpened(String path);
}
