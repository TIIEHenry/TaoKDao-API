package taokdao.api.main;

import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;

import taokdao.api.builder.IBuildManager;
import taokdao.api.data.dex.load.IDexLoader;
import taokdao.api.data.drawable.IDrawableManager;
import taokdao.api.data.mmkv.IMMKVManager;
import taokdao.api.event.record.IEventRecorder;
import taokdao.api.file.open.IFileOpenManager;
import taokdao.api.file.operate.IFileOperateManager;
import taokdao.api.file.system.IFileSystem;
import taokdao.api.main.base.IActivity;
import taokdao.api.main.base.ICoroutine;
import taokdao.api.plugin.install.IPluginInstaller;
import taokdao.api.plugin.load.IPluginLoader;
import taokdao.api.plugin.manage.IPluginManager;
import taokdao.api.project.manage.IProjectManager;
import taokdao.api.setting.language.ILanguageManager;
import taokdao.api.setting.theme.IThemeManager;
import taokdao.api.template.file.IFileTemplateGenerator;
import taokdao.api.template.project.IProjectTemplateGenerator;
import taokdao.api.ui.content.IContentManager;
import taokdao.api.ui.window.explorer.IExplorerWindow;
import taokdao.api.ui.window.tabtool.ITabToolWindow;

public interface IMainActivity extends LifecycleOwner, IActivity, IEventRecorder, ICoroutine {

    /**
     * 资源浏览器窗口
     *
     * @return
     */
    @NonNull
    IExplorerWindow getExplorerWindow();

    /**
     * 工具窗口
     *
     * @return
     */
    @NonNull
    ITabToolWindow getTabToolWindow();

    /**
     * 内容主窗口
     *
     * @return
     */
    @NonNull
    IContentManager getContentManager();


    /**
     * 插件管理器
     *
     * @return
     */
    @NonNull
    IPluginManager getPluginManager();

    /**
     * 插件加载器
     *
     * @return
     */
    @NonNull
    IPluginLoader getPluginLoader();

    /**
     * 插件安装器
     *
     * @return
     */
    @NonNull
    IPluginInstaller getPluginInstaller();


    /**
     * 图片管理器
     *
     * @return
     */
    @NonNull
    IDrawableManager getDrawableManager();

    /**
     * 构建管理器
     *
     * @return
     */
    @NonNull
    IBuildManager getBuildManager();



    /**
     * @return 文件模板生成器
     */
    @NonNull
    IFileTemplateGenerator getFileTemplateGenerator();

    /**
     * 模板生成器
     *
     * @return
     */
    @NonNull
    IProjectTemplateGenerator getProjectTemplateGenerator();


    /**
     * 项目管理器
     *
     * @return
     */
    @NonNull
    IProjectManager getProjectManager();

    /**
     * 文件系统
     *
     * @return
     */
    @NonNull
    IFileSystem getFileSystem();

    /**
     * 存储管理器
     *
     * @return
     */
    @NonNull
    IMMKVManager getMMKVManager();

    /**
     * 语言管理器
     *
     * @return
     */
    @NonNull
    ILanguageManager getLanguageManager();

    /**
     * 主题管理器
     *
     * @return
     */
    @NonNull
    IThemeManager getThemeManager();


    /**
     * dex动态加载工具
     *
     * @return
     */
    @NonNull
    IDexLoader getDexLoader();


    /**
     * 文件操作
     *
     * @return
     */
    @NonNull
    IFileOperateManager getFileOperateManager();

    /**
     * 文件打开
     *
     * @return
     */
    @NonNull
    IFileOpenManager getFileOpenManager();



    /**
     * 设置指示文本
     *
     * @param txt 指示文本
     */
    void setIndicateText(@NonNull String txt);


}
