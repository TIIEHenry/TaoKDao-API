package taokdao.api.data.drawable;

import android.graphics.drawable.Drawable;

import androidx.annotation.Nullable;

import java.util.Map;

public interface IDrawableManager {
    /**
     * 根据后缀
     *
     * @param map "txt" : drawable
     */
    void setDrawableForSuffix(Map<String, Drawable> map);

    @Nullable
    Drawable getDrawableForSuffix(String suffix);

    @Nullable
    Drawable getDefaultDrawableForSuffix();

    void setDefaultDrawableForSuffix(@Nullable Drawable drawable);

    /**
     * 根据文件名
     *
     * @param map "Manifest.xml" : drawable
     */

    void setDrawableForFileName(Map<String, Drawable> map);

    @Nullable
    Drawable getDrawableForFileName(String fileName);

    @Nullable
    Drawable getDefaultDrawableForFileName();

    void setDefaultDrawableForFileName(@Nullable Drawable drawable);

    /**
     * 根据文件夹名
     *
     * @param map "src" : drawable
     */
    void setDrawableForDirName(Map<String, Drawable> map);

    @Nullable
    Drawable getDrawableForDirName(String dirName);

    @Nullable
    Drawable getDefaultDrawableForDirName();

    void setDefaultDrawableForDirName(@Nullable Drawable drawable);

}
