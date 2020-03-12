package androcode.api.plugin;


import androidx.annotation.NonNull;

import com.alibaba.fastjson.JSON;

import java.io.File;

import androcode.base.annotation.Identifier;
import androcode.base.annotation.todo.NeedSet;


public class PluginManifest {
    public static String manifestFileName = "manifest.json";
    @NeedSet
    public File pluginDir;
    @NeedSet
    public File manifestFile;
    @NeedSet
    public Type pluginType;
    /**
     * 插件唯一标识,推荐包名
     */
    @Identifier
    public String id;
    /**
     * 插件类型决定了加载次序 engine
     */
    public String type;
    public Version version;
    public Information information;
    /**
     * 插件支持的语言，如zh-CN
     */
    public String[] languages = new String[]{};
    public Engine engine;
    /**
     * 在对应tabcontent id 的时候打开插件窗口，会显示
     */
    public String[] tabcontents = new String[]{};

    public PluginManifest() {
    }

    public static PluginManifest from(String text) {
        return JSON.parseObject(text, PluginManifest.class);
    }

    @NonNull
    public String toString() {
        return "PluginManifest(file=" + this.manifestFile + ",id=" + this.id + ")";
    }

    public int hashCode() {
        return manifestFile != null ? manifestFile.hashCode() : 0;
    }

    public enum Type {
        TYPE_ENGINE("engine"), TYPE_COMMON("common");

        public final String name;

        Type(String name) {
            this.name = name;
        }
    }

    public static class Information {
        public String author;
        public String label;
        public String icon;
        public String description;
        /**
         * readme文件名,比如README.MD，根据language优先匹配如README-zhCN.MD文件，若找不到则加载README.MD
         */
        public String readme;
        public String[] tags = new String[]{};
    }

    public static class Version {
        public int code;
        public String name;
        public boolean downgrade;
    }

    public static class Engine {
        /**
         * 插件引擎 rhino,luaj,class,replusgin
         */
        public String id;
        public String entrance;
        public String[] parameters = new String[]{};
    }
}
