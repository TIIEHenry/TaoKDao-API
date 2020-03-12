package androcode.api.main;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;

import java.io.File;

import androcode.api.dynamic.dex.IDexLoader;
import androcode.api.builder.IBuilderManager;
import androcode.api.file.system.IFileSystem;
import androcode.api.plugin.IPluginManager;
import androcode.api.project.IProjectManager;
import androcode.api.project.template.IProjectTemplateCreator;
import androcode.api.setting.preference.base.ISharedPreferencesManager;
import androcode.api.setting.language.ILanguageManager;
import androcode.api.ui.content.ITabContentIOManager;
import androcode.api.ui.content.ITabContentManager;
import androcode.api.ui.windows.explorer.IExplorerWindow;
import androcode.api.ui.windows.tabtool.ITabToolWindow;

public interface IMainActivity extends LifecycleOwner {

    /**
     * 资源浏览器窗口
     *
     * @return
     */
    IExplorerWindow getExplorerWindow();

    /**
     * 内容主窗口
     *
     * @return
     */
    ITabContentManager getTabContentManager();

    /**
     * 工具窗口
     *
     * @return
     */
    ITabToolWindow getTabToolWindow();

    ITabContentIOManager getTabContentIOManager();

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
     * 项目生成器
     *
     * @return
     */
    IProjectTemplateCreator getProjectTemplateCreator();

    /**
     * 项目管理器
     *
     * @return
     */
    IProjectManager getProjectManager();

    /**
     * 存储管理器
     *
     * @return
     */
    ISharedPreferencesManager getSharedPreferencesManager();

    /**
     * 语言管理器
     *
     * @return
     */
    ILanguageManager getLanguageManager();

    /**
     * 文件系统
     *
     * @return
     */
    IFileSystem getFileSystem();


    void runOnUIThread(@NonNull Runnable runnable);

    void reloadPlugin();

    void updateIndicatorText(String txt);


    /**
     * 与explorer打开相同
     */
    Boolean openFile(File file);

    Boolean openFile(File file, String openerId);


    void toast(Object o);

    void toast(int id);


    IDexLoader getDexLoader();

    Resources getResources();

    Context getContext();

    AppCompatActivity getActivity();

    /**
     * 资源类
     */
    Drawable getDrawable(int id);

    String getString(int id);

    int getAttrColor(int id);

    int getDimen(int id);

    LayoutInflater getLayoutInflater();

}
