package androcode.api.activity;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;

import java.io.File;

import androcode.api.editor.IEditor;
import androcode.api.plugin.IPluginManager;
import androcode.api.project.IProjectCreator;
import androcode.api.project.IProjectLoader;
import androcode.api.tabpager.ITabPagerManager;
import androcode.api.tabwin.ITabWinIOManager;
import androcode.api.tabwin.ITabWinManager;
import dalvik.system.DexClassLoader;

public interface IMainActivity extends LifecycleOwner {
    ITabWinManager getTabWinManager();

    ITabWinIOManager getTabWinIOManager();

    IPluginManager getPluginManager();

    IProjectLoader getProjectLoader();

    IProjectCreator getProjectCreator();

    LayoutInflater getLayoutInflater();

    void runOnUiThread(Runnable runnable);

    void reloadPlugin();

    void updateIndicatorText(String txt);

    AppCompatActivity getActivity();

    IEditor getCurrentEditor();

    @Nullable
    String getProject();

    void setProject(@Nullable String project);

    ITabPagerManager getTabPagerManager();

    @Nullable
    String getCurrentEditingPath();

//    void setCurrentEditingPath(@Nullable String path);

    void toast(Object o);

    void toast(int id);


    DexClassLoader loadDex(String filePath);

    DexClassLoader loadDexFile(File file);

    /**
     * 与explorer打开相同
     */
    Boolean openFile(File file);

    /**
     * 与explorer打开相同
     */
    boolean openProject(File ideFile);

    Drawable getDrawable(int id);

    String getString(int id);
}
