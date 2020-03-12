package androcode.api.file.opener;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;

import androcode.api.main.IMainActivity;
import androcode.api.ui.content.ITabContentManager;
import androcode.base.identifiable.Identifiable;

public interface IFileOpener extends Identifiable<String>, FileOpenerChecker {
    @Nullable
    Drawable getIcon();

    @NonNull
    String getLabel();

    @NonNull
    String getDescription();

    void click(@NonNull IMainActivity main, @NonNull ITabContentManager manager, @NonNull File file);

    default boolean longClick(@NonNull IMainActivity main, @NonNull ITabContentManager manager, @NonNull File file) {
        return false;
    }
}
