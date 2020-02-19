package androcode.api.plugin;


import android.graphics.drawable.Drawable;
import android.os.FileUtils;

import com.alibaba.fastjson.JSON;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class PluginInfo {
    public String id;//插件唯一标识,推荐com.xxx.xxx
    public String icon;//插件图标，如icon.png
    public String label;//插件名称
    public int versionCode;//版本号
    public String versionName;//版本名称
    public String author;//作者
    public String description;//介绍
    public String entrance;//js文件入口 默认init.js
    public String[] showSuffix = new String[]{};//显示的文件后缀
    public String[] hideSuffix = new String[]{};//不显示的文件后缀
    public String[] type = new String[]{};//类型
    public String[] language = new String[]{};//插件支持的语言，如zh-CN
    public String[] preference = new String[]{};//设置,如preference/main.js未定
    public boolean allowDegrade;//是否允许降级安装
    public File dir;
    public Drawable iconDrawable;

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
