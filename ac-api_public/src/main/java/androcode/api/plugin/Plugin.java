package androcode.api.plugin;

import android.graphics.drawable.Drawable;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import androcode.api.plugin.engine.IPluginEngine;
import androcode.api.plugin.loader.PluginManifest;
import androcode.base.annotation.Identifier;
import androcode.base.annotation.todo.NeedSet;

public class Plugin {
    public final File pluginDir;
    public final File manifestFile;
    public PluginManifest manifest;
    @Identifier
    public String id;

    public PluginManifest.Type type;

    public PluginManifest.Version version;

    public Information information;

    public List<String> language;

    public Engine engine;

    /**
     * 在对应tabcontent id 的时候打开插件窗口，会显示
     */
    public List<String> tabcontent;

    public Plugin(PluginManifest manifest) {
        this.manifest = manifest;
        this.pluginDir = manifest.pluginDir;
        this.manifestFile = manifest.manifestFile;
        this.id = manifest.id;
        this.type = manifest.pluginType;
        this.version = manifest.version;
        this.language = Arrays.asList(manifest.languages);
        this.tabcontent = Arrays.asList(manifest.tabcontents);
        this.information = new Information(manifest.pluginDir, manifest.information);
        this.engine = new Engine(manifest.engine);
    }


    public void onLoad() {
        engine.engine.onLoadPlugin(this);
    }

    public void onInit() {
        engine.engine.onInitPlugin(this);
    }

    public void onCall() {
        engine.engine.onCallPlugin(this);
    }

    public void onDestroy() {
        engine.engine.onDestroyPlugin(this);
    }

    public static class Information {
        public String author;
        public String label;
        public Drawable icon;
        public String description;
        public String readme;
        public List<String> tag;

        public Information(File pluginDir, PluginManifest.Information information) {
            this.author = information.author;
            this.label = information.label;
            this.icon = Drawable.createFromPath(new File(pluginDir, information.icon).getAbsolutePath());
            this.description = information.description;
            this.readme = information.readme;
            this.tag = Arrays.asList(information.tags);
        }
    }

    public static class Engine {
        @NeedSet
        public IPluginEngine engine;
        public String entrance;
        public String[] parameter;

        public Engine(PluginManifest.Engine engine) {
            this.entrance = engine.entrance;
            this.parameter = engine.parameters;
        }
    }

}
