package androcode.api.activity;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;

import java.io.File;

import androcode.api.drawer.IDrawerBottom;
import androcode.api.drawer.IDrawerStart;
import androcode.api.editor.IEditor;
import androcode.api.explorer.IFileOpenerManager;
import androcode.api.plugin.IPluginManager;
import androcode.api.project.IProjectCreator;
import androcode.api.project.IProjectLoader;
import androcode.api.content.ITabWinIOManager;
import androcode.api.content.ITabWinManager;
import dalvik.system.DexClassLoader;

public interface IMainActivity extends LifecycleOwner {
    ITabWinManager getTabWinManager();

    ITabWinIOManager getTabWinIOManager();

    IPluginManager getPluginManager();

    IProjectLoader getProjectLoader();
//    IProjectBuilder getProjectBuilder();

    IProjectCreator getProjectCreator();

    IFileOpenerManager getFileOpenerManager();

    LayoutInflater getLayoutInflater();

    void runOnUiThread(Runnable runnable);

    void reloadPlugin();

    void updateIndicatorText(String txt);

    AppCompatActivity getActivity();

    IEditor getCurrentEditor();

    @Nullable
    String getProject();

    void setProject(@Nullable String project);

    IDrawerStart getDrawerStart();
    IDrawerBottom getDrawerBottom();

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

    Boolean openFile(File file, String openerId);

    /**
     * 与explorer打开相同
     */
    boolean openProject(File ideFile);

    Drawable getDrawable(int id);

    String getString(int id);
}
