package androcode.api.plugin;


import android.graphics.drawable.Drawable;
import android.os.FileUtils;

import com.alibaba.fastjson.JSON;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class PluginInfo {
    public String id;
    public String icon;
    public Drawable iconDrawable;
    public String label;
    public int versionCode;
    public String versionName;
    public String author;
    public String description;
    public String[] showSuffix = new String[]{};
    public String[] hideSuffix = new String[]{};
    public boolean allowDegrade;
    public File dir;

    public PluginInfo() {
    }
    public PluginInfo(File dir) {
        this.dir = dir;
    }

    public String toString() {
        return "PluginInfo(dir=" + this.dir + ",id                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                =" + this.dir + ")";
    }

    public int hashCode() {
        return dir != null ? dir.hashCode() : 0;
    }
}
