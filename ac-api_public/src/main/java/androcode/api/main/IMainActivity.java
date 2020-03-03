package androcode.api.main;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;

import java.io.File;

import androcode.api.main.drawer.IDrawerBottom;
import androcode.api.main.drawer.IDrawerStart;
import androcode.api.editor.IEditor;
import androcode.api.plugin.IPluginManager;
import androcode.api.project.IProjectCreator;
import androcode.api.project.IProjectLoader;
import androcode.api.main.content.ITabContentIOManager;
import androcode.api.main.content.ITabContentManager;
import dalvik.system.DexClassLoader;

public interface IMainActivity extends LifecycleOwner {

    ITabContentManager getTabContentManager();

    ITabContentIOManager getTabContentIOManager();

    IPluginManager getPluginManager();

    IProjectLoader getProjectLoader();
//    IProjectBuilder getProjectBuilder();

    IProjectCreator getProjectCreator();


    LayoutInflater getLayoutInflater();

    void runOnUiThread(Runnable runnable);

    void reloadPlugin();

    void updateIndicatorText(String txt);

    AppCompatActivity getActivity();

    IEditor getCurrentEditor();

    String getLanguageCountry();

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

    int getAttrColor(int id);

    int getDimen(int id);
}
