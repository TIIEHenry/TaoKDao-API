package taokdao.api.file.open.wrapped;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import taokdao.api.data.bean.Properties;
import taokdao.api.file.open.FileOpenerChecker;
import taokdao.api.file.open.IFileOpener;
import taokdao.base.annotation.relation.MainConstructor;

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

    public FileOpener(@NonNull Properties properties, FileOpenerChecker checker) {
        this(properties, null, checker);
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

    @Override
    public String toString() {
        return "FileOpen{" +
                "id='" + id + '\'' +
                ", icon=" + icon +
                ", label='" + label + '\'' +
                ", description='" + description + '\'' +
                ", checker=" + checker +
                '}';
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
    public boolean isSupport(@NonNull String path) {
        return checker.isSupport(path);
    }

    @NonNull
    @Override
    public String id() {
        return id;
    }
}
