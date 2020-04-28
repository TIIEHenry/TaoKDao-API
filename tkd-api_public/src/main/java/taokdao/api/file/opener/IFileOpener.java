package taokdao.api.file.opener;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;

import taokdao.api.data.bean.IProperties;
import taokdao.api.main.IMainActivity;
import taokdao.api.ui.content.IContentManager;

public interface IFileOpener extends IProperties, FileOpenerChecker {
    @Nullable
    Drawable getIcon();

    @NonNull
    String getLabel();

    void click(@NonNull IMainActivity main, @NonNull IContentManager manager, @NonNull File file);

    default boolean longClick(@NonNull IMainActivity main, @NonNull IContentManager manager, @NonNull File file) {
        return false;
    }
}
