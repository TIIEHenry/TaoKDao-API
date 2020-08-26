package taokdao.api.file.operate.wrapped;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import taokdao.api.base.annotation.relation.MainConstructor;
import taokdao.api.data.bean.IProperties;
import taokdao.api.file.operate.FileOperatorCallback;
import taokdao.api.file.operate.IFileOperator;
import taokdao.api.main.IMainContext;

public abstract class BaseFileOperator implements IFileOperator {
    protected final String description;
    protected final String id;
    protected String label;
    protected Drawable icon;
    protected FileOperatorCallback callback;


    @MainConstructor
    public BaseFileOperator(@NonNull IProperties properties, @Nullable Drawable icon, FileOperatorCallback callback) {
        this.id = properties.id();
        this.label = properties.getLabel();
        this.description = properties.getDescription();
        this.icon = icon;
        this.callback = callback;
    }

    public BaseFileOperator(@NonNull IProperties properties, FileOperatorCallback callback) {
        this(properties, null, callback);
    }

    @Override
    public boolean call(IMainContext main, String path) {
        return callback.call(main, path);
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

    @Override
    public String toString() {
        return "FileOperate{" +
                "description='" + description + '\'' +
                ", id='" + id + '\'' +
                ", label='" + label + '\'' +
                ", icon=" + icon +
                ", callback=" + callback +
                '}';
    }
}
