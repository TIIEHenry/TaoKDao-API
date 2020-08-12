package taokdao.api.file.open.wrapped;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

import taokdao.api.file.open.IFileOpener;

public abstract class SuffixIFileOpener implements IFileOpener {

    protected List<String> supportSuffix = new ArrayList<>();

    @Override
    public boolean isSupport(@NonNull String path) {
        return supportSuffix.contains(path.substring(path.lastIndexOf(".") + 1));
    }

}
