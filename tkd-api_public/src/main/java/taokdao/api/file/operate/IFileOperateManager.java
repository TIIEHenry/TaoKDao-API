package taokdao.api.file.operate;

import androidx.annotation.NonNull;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public interface IFileOperateManager {
    void init();

    default void showOperateDialog(@NonNull File file) {
        showOperateDialog(file, new ArrayList<>(FileOperatorPool.getInstance().getForFile(file)));
    }

    void showOperateDialog(@NonNull File file, @NonNull List<IFileOperator> operatorList);
}
