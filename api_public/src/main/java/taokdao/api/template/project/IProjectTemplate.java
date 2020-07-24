package taokdao.api.template.project;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;

import taokdao.api.data.bean.IProperties;

public interface IProjectTemplate extends IProperties {
    @Nullable
    Drawable getIcon();

    @NonNull
    String getLabel();

    @NonNull
    String getDescription();

    /**
     * 创建template的点击回调
     *
     * @param dir template所在文件夹
     */
    void generate(File dir);

    /**
     * 显示template信息的回调
     */
    void showInfo();
}
