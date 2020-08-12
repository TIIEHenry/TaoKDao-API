package taokdao.api.file.open.wrapped;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import taokdao.api.base.annotation.relation.MainConstructor;
import taokdao.api.data.bean.Properties;
import taokdao.api.file.open.IFileOpener;

public abstract class BaseFileOpener implements IFileOpener {
    protected final String id;
    @Nullable
    protected Drawable icon;
    @NonNull
    protected String label;
    @Nullable
    protected String description;

    @MainConstructor
    public BaseFileOpener(@NonNull Properties properties, @Nullable Drawable icon) {
        this.id = properties.id;
        this.label = properties.label;
        this.description = properties.des;
        this.icon = icon;
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
                ", description='" + description +
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

    @NonNull
    @Override
    public String id() {
        return id;
    }
}
