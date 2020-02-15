package androcode.api.activity;

import android.app.Activity;
import android.graphics.drawable.Drawable;

import androidx.annotation.Nullable;
import androidx.lifecycle.LifecycleOwner;

import java.io.File;

import androcode.api.editor.IEditor;
import androcode.api.plugin.IPluginManager;
import androcode.api.tabpager.ITabPagerManager;
import androcode.api.tabwin.ITabWinIOManager;
import androcode.api.tabwin.ITabWinManager;
import dalvik.system.DexClassLoader;

public interface IMainActivity extends LifecycleOwner {
    ITabWinManager getTabWinManager();

    ITabWinIOManager getTabWinIOManager();

    IPluginManager getPluginManager();

    void updateIndicatorText(String txt);

    Activity getActivity();

    IEditor getCurrentEditor();

    ITabPagerManager getTabPagerManager();

    @Nullable
    String getCurrentEditingPath();

    void toast(Object o);

    void toast(int id);

    void refreshExplorer();

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
