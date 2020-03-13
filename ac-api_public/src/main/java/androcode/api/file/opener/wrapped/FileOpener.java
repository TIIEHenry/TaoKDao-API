package androcode.api.file.opener.wrapped;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;

import androcode.api.bean.Properties;
import androcode.api.file.opener.FileOpenerChecker;
import androcode.api.file.opener.IFileOpener;
import androcode.base.annotation.relation.MainConstructor;

/**
 * 实现对文件的打开操作
 */
public abstract class FileOpener implements IFileOpener {
    public final String id;
    @Nullable
    public Drawable icon;
    @NonNull
    public String label;
    @Nullable
    public String description;
    @NonNull
    private
    FileOpenerChecker checker;

    @MainConstructor
    public FileOpener(@NonNull Properties properties, @Nullable Drawable icon, @NonNull FileOpenerChecker checker) {
        this.id = properties.id;
        this.label = properties.label;
        this.description = properties.des;
        this.icon = icon;
        this.checker = checker;
    }

    public FileOpener(@NonNull Properties properties,  FileOpenerChecker checker) {
        this(properties,null, checker);
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

    @Nullable
    @Override
    public Drawable getIcon() {
        return icon;
    }

    @NonNull
    @Override
    public String getLabel() {
        return label;
    }

    @Nullable
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isSupport(@NonNull File file) {
        return checker.isSupport(file);
    }

    @NonNull
    @Override
    public String id() {
        return id;
    }
}
