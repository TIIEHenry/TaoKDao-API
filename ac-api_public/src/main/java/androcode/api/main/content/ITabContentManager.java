package androcode.api.main.content;

import androidx.annotation.Nullable;

import java.util.LinkedHashMap;
import java.util.List;

import androcode.api.editor.IEditor;
import androcode.api.file.opener.FileOpener;

public interface ITabContentManager {
    void onCreate();

    void closeCurrent();

    void closeOther();

    void closeAll();

    void closeAlltotheLeft();

    void closeAlltotheRight();

    void addTabContent(TabContent tabContent, boolean selectNewWin, FileOpener opener);

    /**
     * selectNewWin true
     */
    void addTabContent(TabContent tabContent, FileOpener opener);

    void removeTabContent(TabContent tabContent);

    boolean selectTabContent(TabContent tabContent);

    boolean selectTabContent(String path);

    boolean selectTabContent(int index);

    @Nullable
    TabContent getCurrentTabContent();

    @Nullable
    IEditor getCurrentEditor();

    @Nullable
    String getCurrentPath();

    List<TabContent> getTabContentList();

    boolean openNew(String path);

    boolean openNew(String path,String opener);

    List<String> getOpenedFilePaths();


    LinkedHashMap<String, FileOpener> getPathOpenerMap();

    boolean isFileOpened(String path);
}
