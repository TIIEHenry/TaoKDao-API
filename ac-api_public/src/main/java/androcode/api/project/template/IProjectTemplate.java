package androcode.api.project.template;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;

import androcode.api.bean.IProperties;
import androcode.base.identifiable.Identifiable;

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
     * @param dir templaate所在文件夹
     */
    void onCreateTemplate(File dir);

    /**
     * 显示template信息的回调
     */
    void onShowTemplateInfo();
}
