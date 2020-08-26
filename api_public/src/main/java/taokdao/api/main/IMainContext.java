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
import taokdao.api.file.provider.IFileProvider;
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
import taokdao.api.ui.content.manage.IContentManager;
import taokdao.api.ui.explorer.IExplorerWindow;
import taokdao.api.ui.toolgroup.IToolGroupWindow;
import tiiehenry.android.ui.dialogs.api.strategy.Dialogs;

public interface IMainContext extends LifecycleOwner, IActivity, IEventRecorder, ICoroutine {

    /**
     * @return 弹窗
     */
    @NonNull
    Dialogs getDialogs();

    /**
     * @return 资源浏览器窗口
     */
    @NonNull
    IExplorerWindow getExplorerWindow();

    /**
     * @return 工具窗口
     */
    @NonNull
    IToolGroupWindow getToolGroupWindow();

    /**
     * @return 内容主窗口
     */
    @NonNull
    IContentManager getContentManager();


    /**
     * @return 插件管理器
     */
    @NonNull
    IPluginManager getPluginManager();

    /**
     * @return 插件加载器
     */
    @NonNull
    IPluginLoader getPluginLoader();

    /**
     * @return 插件安装器
     */
    @NonNull
    IPluginInstaller getPluginInstaller();


    /**
     * @return 图片管理器
     */
    @NonNull
    IDrawableManager getDrawableManager();

    /**
     * @return 构建管理器
     */
    @NonNull
    IBuildManager getBuildManager();


    /**
     * @return 文件模板生成器
     */
    @NonNull
    IFileTemplateGenerator getFileTemplateGenerator();

    /**
     * @return 模板生成器
     */
    @NonNull
    IProjectTemplateGenerator getProjectTemplateGenerator();


    /**
     * @return 项目管理器
     */
    @NonNull
    IProjectManager getProjectManager();

    /**
     * @return 文件系统
     */
    @NonNull
    IFileSystem getFileSystem();

    /**
     * @return 文件提供者
     */
    @NonNull
    IFileProvider getFileProvider();

    /**
     * @return 存储管理器
     */
    @NonNull
    IMMKVManager getMMKVManager();

    /**
     * @return 语言管理器
     */
    @NonNull
    ILanguageManager getLanguageManager();

    /**
     * @return 主题管理器
     */
    @NonNull
    IThemeManager getThemeManager();


    /**
     * @return dex动态加载工具
     */
    @NonNull
    IDexLoader getDexLoader();


    /**
     * @return 文件操作
     */
    @NonNull
    IFileOperateManager getFileOperateManager();

    /**
     * @return 文件打开
     */
    @NonNull
    IFileOpenManager getFileOpenManager();

    /**
     * @return 事件记录器
     */
    @NonNull
    default IEventRecorder getEventRecorder() {
        return this;
    }

    /**
     * 设置指示文本
     *
     * @param txt 指示文本
     */
    void setIndicateText(@NonNull String txt);

}
