package androcode.api.builder;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androcode.api.bean.IProperties;
import androcode.api.main.IMainActivity;
import androcode.base.identifiable.Identifiable;

/**
 * 构建选项
 *
 * @param <I> 类型Project或File 对应构建Project和File
 */
public interface IBuildOption<I> extends IProperties, IBuildCallback<I> {

    @Nullable
    Drawable getIcon();

    @NonNull
    String getLabel();


    default boolean onBuild(IMainActivity main, I config) {
        return onBuild(main, config, this);
    }
}
