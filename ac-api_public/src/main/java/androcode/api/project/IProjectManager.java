package androcode.api.project;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;

import androcode.api.project.loader.IProjectLoader;

public interface IProjectManager {

    /**
     * 工程加载器
     *
     * @return
     */
    @NonNull
    IProjectLoader getProjectLoader();

    /**
     * 打开工程
     *
     * @param file 工程配置文件
     * @return 是否打开成功
     */
    boolean openProject(@NonNull File file);

    /**
     * 关闭工程
     */
    void closeProject();


    /**
     * 重新打开当前工程
     *
     * @return 是否打开成功
     */
    boolean reopenProject();

    /**
     * @return 是否已打开工程
     */
    boolean isProjectOpened();

    /**
     * @return 打开的工程
     */
    @Nullable
    Project getProject();

    /**
     * 关闭工程请使用closeProject
     *
     * @param project 设置已打开的工程
     */
    void setProject(@Nullable Project project);


}
