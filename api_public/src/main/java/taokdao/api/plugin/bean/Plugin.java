package taokdao.api.plugin.bean;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import taokdao.api.base.annotation.Identifier;
import taokdao.api.base.annotation.todo.NeedSet;
import taokdao.api.main.IMainContext;
import taokdao.api.plugin.bridge.invoke.IInvokeCallback;
import taokdao.api.plugin.bridge.invoke.IInvoker;
import taokdao.api.plugin.engine.IPluginEngine;

public class Plugin implements IInvoker {
    public final File pluginDir;
    public final File manifestFile;

    public PluginManifest manifest;
    @Identifier
    public String id;

    public String api;

    public PluginType type;

    public PluginVersion version;

    public List<Information> information = new ArrayList<>();

    public List<String> languages = new ArrayList<>();

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
        this.visibility = manifest.visibility.parse();
        for (PluginManifest.Information info : manifest.information) {
            this.information.add(new Information(manifest.pluginDir, info));
            this.languages.addAll(info.languages);
        }
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

    @Nullable
    @Override
    public String onInvoke(@NonNull String method, @Nullable String params, @Nullable IInvokeCallback invokeCallback) {
        return engine.engine.invokePlugin(this, method, params, invokeCallback);
    }

    public Information getInformation(@NonNull String languageCountry) {
        for (Information information1 : information) {
            if (information1.languages.contains(languageCountry)) {
                return information1;
            }
        }
        for (Information information1 : information) {
            if (information1.languages.contains("default")) {
                return information1;
            }
        }
        return information.get(0);
    }

    public Information getInformation(@NonNull IMainContext mainContext) {
        return getInformation(mainContext.getLanguageManager().getLanguageCountry());
    }

    public static class Information {
        public List<String> languages;
        public String author;
        public String label;
        @Nullable
        @NeedSet
        public Drawable icon;
        public String description;
        public String readme;
        public List<String> tags;

        public Information() {

        }

        public Information(File pluginDir, PluginManifest.Information information) {
            this.languages = information.languages;
            this.author = information.author;
            this.label = information.label;
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
