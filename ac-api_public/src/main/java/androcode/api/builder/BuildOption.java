package androcode.api.builder;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androcode.api.main.IMainActivity;
import androcode.base.annotation.relation.MainConstructor;

public class BuildOption<I> implements IBuildOption<I> {
    private final String id;
    private final String label;
    private final Drawable icon;
    private final IBuildCallback<I> callback;

    @MainConstructor
    public BuildOption(@NonNull String id, @NonNull String label, @Nullable Drawable icon, @NonNull IBuildCallback<I> callback) {
        this.id = id;
        this.label = label;
        this.icon = icon;
        this.callback = callback;
    }

    public BuildOption(@NonNull String id, @NonNull String label, @NonNull IBuildCallback<I> callback) {
        this(id, label, null, callback);
    }


    @NonNull
    @Override
    public String id() {
        return id;
    }

    @NonNull
    @Override
    public String getLabel() {
        return label;
    }

    @Nullable
    @Override
    public Drawable getIcon() {
        return icon;
    }

    @Override
    public boolean onBuild(IMainActivity main, I config, IBuildOption<I> option) {
        return callback.onBuild(main, config, option);
    }

}







