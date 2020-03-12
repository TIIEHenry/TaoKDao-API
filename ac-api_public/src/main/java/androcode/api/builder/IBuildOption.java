package androcode.api.builder;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androcode.api.main.IMainActivity;
import androcode.base.identifiable.Identifiable;

public interface IBuildOption<I> extends Identifiable<String>, IBuildCallback<I> {

    @NonNull
    String getLabel();

    @Nullable
    Drawable getIcon();

    default boolean onBuild(IMainActivity main, I config) {
        return onBuild(main, config, this);
    }
}
