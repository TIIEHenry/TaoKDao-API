package androcode.api.project;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import androcode.api.main.IMainActivity;
import androcode.api.project.builder.IProjectBuilder;
import androcode.api.project.loader.ProjectConfig;
import androcode.api.project.plugin.IProjectPlugin;
import androcode.base.annotation.todo.NeedSet;

public class Project {
    public ProjectConfig projectConfig;

    @Nullable
    public String name;

    public File projectDir;
    public File configFile;


    @NeedSet
    public IProjectBuilder builder;
    @NeedSet
    public Set<Project> projects = new HashSet<>();

    @NeedSet
    public Set<Plugin> plugins = new HashSet<>();

    public Map<String, Object> setting;


    public Project(ProjectConfig projectConfig) {
        this.projectConfig = projectConfig;
        if (projectConfig.name == null)
            this.name = projectConfig.configFile.getName();
        else
            this.name = projectConfig.name;
        this.projectDir = projectConfig.projectDir;
        this.configFile = projectConfig.configFile;
        this.setting = projectConfig.setting;
    }

    public boolean buildDefault(IMainActivity main) {
        return builder.getDefaultBuildOption().onBuild(main, this);
    }

    public static class Plugin {
        @NonNull
        public IProjectPlugin plugin;
        @Nullable
        public List<?> parameters;

        public Plugin(@NonNull IProjectPlugin plugin, @Nullable List<?> parameters) {
            this.plugin = plugin;
            this.parameters = parameters;
        }
    }
}
