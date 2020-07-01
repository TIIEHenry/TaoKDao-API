package taokdao.api.file.open;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public interface IFileOpenManager {
    void init();

    boolean requestOpen(@NonNull String path);

    /**
     * @param path     文件路径
     * @param openerId FileOpener.id
     * @return 是否处理了
     */
    boolean requestOpenByOpenerId(@NonNull String path, @NonNull String openerId);

    default void showChooseOpenerDialog(@NonNull String path) {
        showChooseOpenerDialog(path, new ArrayList<>(FileOpenerPool.getInstance().getForPath(path)));
    }

    void showChooseOpenerDialog(@NonNull String path, @NonNull List<IFileOpener> openerList);


    boolean isFileOpened(@NonNull String path);
}
