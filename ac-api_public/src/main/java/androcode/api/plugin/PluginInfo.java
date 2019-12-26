package androcode.api.plugin;


import android.graphics.drawable.Drawable;

import java.io.File;


public class PluginInfo {
    public String id;
    public Drawable icon;
    public String label;
    public int versionCode;
    public String versionName;
    public String author;
    public String description;
    public String[] supportFile=new String[]{};
    public String[] unsupportFile=new String[]{};
    public boolean allowDegrade;
    public File dir;

    public PluginInfo(File dir){
        this.dir=dir;
    }
    public String toString() {
        return "PluginInfo(dir=" + this.dir + ",id                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                =" + this.dir + ")";
    }

    public int hashCode() {
        return dir != null ? dir.hashCode() : 0;
    }
}
