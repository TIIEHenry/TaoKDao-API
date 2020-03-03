package androcode.api.file.opener;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;

import androcode.api.annotation.MainConstructor;
import androcode.api.main.IMainActivity;
import androcode.api.main.content.ITabContentManager;

/**
 * 实现对文件的打开操作
 */
public abstract class FileOpener {
    public final String id;
    @Nullable
    public Drawable icon;
    @NonNull
    public String label;
    @NonNull
    public String description;
    @NonNull
    public Checker checker;

    @MainConstructor
    public FileOpener(String id, @Nullable Drawable icon, @NonNull String label, @NonNull String description, @NonNull Checker checker) {
        this.id = id;
        this.icon = icon;
        this.label = label;
        this.description = description;
        this.checker = checker;
    }

    public FileOpener(String id, String label, String description, Checker checker) {
        this(id, null, label, description, checker);
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof SuffixFileOpener)
            return id.equals(((SuffixFileOpener) obj).id);
        return false;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @NonNull
    @Override
    public String toString() {
        return "opener{id:" + id + "label:" + label + "}" + super.toString();
    }

    public abstract void click(@NonNull IMainActivity main, @NonNull ITabContentManager manager, @NonNull File file);

    public boolean longClick(@NonNull IMainActivity main, @NonNull ITabContentManager manager, @NonNull File file) {
        return false;
    }

    public interface Checker {
        boolean isSupport(File file);
    }
}
