package taokdao.api.builder.wrapped;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import taokdao.api.builder.callback.IBuildCallback;
import taokdao.api.builder.IBuildOption;
import taokdao.api.data.bean.IProperties;
import taokdao.api.main.IMainContext;
import taokdao.api.base.annotation.relation.MainConstructor;

public class BuildOption<I> implements IBuildOption<I> {
    private final String id;
    private final String label;
    private final String description;
    private final Drawable icon;
    private final IBuildCallback<I> callback;

    @MainConstructor
    public BuildOption(@NonNull IProperties properties, @Nullable Drawable icon, @NonNull IBuildCallback<I> callback) {
        this.id = properties.id();
        this.label = properties.getLabel();
        this.description = properties.getDescription();
        this.icon = icon;
        this.callback = callback;
    }


    @MainConstructor
    public BuildOption(@NonNull IProperties properties, @NonNull IBuildCallback<I> callback) {
        this(properties, null, callback);
    }


    @NonNull
    @Override
    public String id() {
        return id;
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
    public boolean onBuild(@NonNull IMainContext main, @NonNull I config, @NonNull IBuildOption<I> option) {
        return onBuild(main, config);
    }

    @Override
    public boolean onBuild(@NonNull IMainContext main, @NonNull I config) {
        return callback.onBuild(main, config, this);
    }
}







