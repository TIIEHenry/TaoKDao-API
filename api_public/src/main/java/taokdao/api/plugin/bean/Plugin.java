package taokdao.api.plugin.bean;

import android.graphics.drawable.Drawable;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import taokdao.api.plugin.engine.IPluginEngine;
import taokdao.base.annotation.Identifier;
import taokdao.base.annotation.todo.NeedSet;

public class Plugin {
    public final File pluginDir;
    public final File manifestFile;
    public PluginManifest manifest;
    @Identifier
    public String id;

    public String api;

    public PluginType type;

    public PluginVersion version;

    public Information information;

    public List<String> languages;

    public Engine engine;

    public PluginVisibility visibility;

    public Plugin(PluginManifest manifest) {
        this.manifest = manifest;
        this.pluginDir = manifest.pluginDir;
        this.manifestFile = manifest.manifestFile;
        this.id = manifest.id;
        this.api = manifest.api;
        this.type = manifest.pluginType;
        this.version = manifest.version;
        this.languages = Arrays.asList(manifest.languages);
        this.visibility = manifest.visibility.parse();
        this.information = new Information(manifest.pluginDir, manifest.information);
        this.engine = new Engine(manifest.engine);
    }


    public void onUpGrade() {
        engine.engine.callPluginAction(this, PluginActions.onUpGrade);
    }

    public void onDownGrade() {
        engine.engine.callPluginAction(this, PluginActions.onDownGrade);
    }

    public void onCreate() {
        engine.engine.callPluginAction(this, PluginActions.onCreate);
    }

    public void onInit() {
        engine.engine.callPluginAction(this, PluginActions.onInit);
    }

    public void onCall() {
        engine.engine.callPluginAction(this, PluginActions.onCall);
    }

    public void onDestroy() {
        engine.engine.callPluginAction(this, PluginActions.onDestroy);
    }

    public void onPause() {
        engine.engine.callPluginAction(this, PluginActions.onPause);
    }

    public void onResume() {
        engine.engine.callPluginAction(this, PluginActions.onResume);
    }


    public static class Information {
        public String author;
        public String label;
        public Drawable icon;
        public String description;
        public String readme;
        public List<String> tags;

        public Information() {

        }

        public Information(File pluginDir, PluginManifest.Information information) {
            this.author = information.author;
            this.label = information.label;
            this.icon = Drawable.createFromPath(new File(pluginDir, information.icon).getAbsolutePath());
            this.description = information.description;
            this.readme = information.readme;
            this.tags = Arrays.asList(information.tags);
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
