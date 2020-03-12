package androcode.api.ui.content;

import java.util.List;

public interface ITabContentIOManager {
    void saveCurrent();

    void saveAllAsync();

    void saveAll();
    boolean openNew(String path);

    boolean openNew(String path, String opener);

    List<String> getOpenedFilePaths();



    boolean isFileOpened(String path);
}
