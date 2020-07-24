package taokdao.api.file.open;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import taokdao.api.data.bean.IProperties;
import taokdao.api.main.IMainContext;
import taokdao.api.ui.content.manage.IContentManager;

public interface IFileOpener extends IProperties, FileOpenerChecker {
    @Nullable
    Drawable getIcon();

    @NonNull
    String getLabel();

    void click(@NonNull IMainContext main, @NonNull IContentManager manager, @NonNull String path);

    default boolean longClick(@NonNull IMainContext main, @NonNull IContentManager manager, @NonNull String path) {
        return false;
    }
}
