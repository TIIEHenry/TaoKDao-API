package androcode.api.builder.wrapped;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androcode.api.bean.Properties;
import androcode.api.builder.IBuildCallback;
import androcode.api.builder.IBuildOption;
import androcode.api.main.IMainActivity;
import androcode.base.annotation.relation.MainConstructor;

public class BuildOption<I> implements IBuildOption<I> {
    private final String id;
    private final String label;
    private final String description;
    private final Drawable icon;
    private final IBuildCallback<I> callback;

    @MainConstructor
    public BuildOption(@NonNull Properties properties, @Nullable Drawable icon, @NonNull IBuildCallback<I> callback) {
        this.id = properties.id;
        this.label = properties.label;
        this.description = properties.des;
        this.icon = icon;
        this.callback = callback;
    }


    @MainConstructor
    public BuildOption(@NonNull Properties properties, @NonNull IBuildCallback<I> callback) {
        this(properties,null,callback);
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
    public boolean onBuild(IMainActivity main, I config, IBuildOption<I> option) {
        return callback.onBuild(main, config, option);
    }

}







