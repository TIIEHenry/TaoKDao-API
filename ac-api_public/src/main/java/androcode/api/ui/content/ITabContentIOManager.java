package androcode.api.ui.content;

import java.util.LinkedHashMap;
import java.util.List;

import androcode.api.file.opener.FileOpener;

public interface ITabContentIOManager {
    void saveCurrent();

    void saveAllAsync();

    void saveAll();
    boolean openNew(String path);

    boolean openNew(String path, String opener);

    List<String> getOpenedFilePaths();



    boolean isFileOpened(String path);
}
