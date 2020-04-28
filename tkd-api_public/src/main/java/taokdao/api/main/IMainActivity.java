package taokdao.api.main;

import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;

import taokdao.api.builder.IBuilderManager;
import taokdao.api.data.dex.IDexLoader;
import taokdao.api.data.mmkv.IMMKVManager;
import taokdao.api.event.IEventRecorder;
import taokdao.api.file.system.IFileSystem;
import taokdao.api.main.base.IActivity;
import taokdao.api.main.base.ICoroutine;
import taokdao.api.plugin.IPluginManager;
import taokdao.api.project.IProjectManager;
import taokdao.api.setting.language.ILanguageManager;
import taokdao.api.setting.theme.IThemeManager;
import taokdao.api.template.ITemplateCreator;
import taokdao.api.ui.content.IContentManager;
import taokdao.api.ui.window.explorer.IExplorerWindow;
import taokdao.api.ui.window.tabtool.ITabToolWindow;

public interface IMainActivity extends LifecycleOwner, IActivity, IEventRecorder, ICoroutine {

    /**
     * 资源浏览器窗口
     *
     * @return
     */
    IExplorerWindow getExplorerWindow();

    /**
     * 工具窗口
     *
     * @return
     */
    ITabToolWindow getTabToolWindow();

    /**
     * 内容主窗口
     *
     * @return
     */
    IContentManager getTabContentManager();

    /**
     * 插件管理器
     *
     * @return
     */
    IPluginManager getPluginManager();

    /**
     * 构建管理器
     *
     * @return
     */
    IBuilderManager getBuilderManager();


    /**
     * 模板生成器
     *
     * @return
     */
    ITemplateCreator getProjectTemplateCreator();

    /**
     * 项目管理器
     *
     * @return
     */
    IProjectManager getProjectManager();

    /**
     * 文件系统
     *
     * @return
     */
    IFileSystem getFileSystem();

    /**
     * 存储管理器
     *
     * @return
     */
    IMMKVManager getMMKVManager();

    /**
     * 语言管理器
     *
     * @return
     */
    ILanguageManager getLanguageManager();

    /**
     * 主题管理器
     *
     * @return
     */
    IThemeManager getThemeManager();


    /**
     * dex动态加载工具
     *
     * @return
     */
    IDexLoader getDexLoader();


    /**
     * 设置指示文本
     *
     * @param txt 指示文本
     */
    void setIndicateText(@NonNull String txt);


}
