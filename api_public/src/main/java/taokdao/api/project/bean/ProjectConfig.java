package taokdao.api.project.bean;

import com.alibaba.fastjson.JSON;

import java.io.File;
import java.util.List;
import java.util.Map;

import taokdao.api.base.annotation.maintain.LongTerm;

@LongTerm
public class ProjectConfig {
    public File projectDir;

    public File configFile;

    public String name;

    public String builder;

    public List<ProjectPluginJson> plugins;
    public List<RelativePath> projects;
    public Map<String, Object> setting;

    public ProjectConfig() {
    }

    public ProjectConfig(ProjectConfigJson projectConfigJson) {
        this.name = projectConfigJson.name;
        this.builder = projectConfigJson.builder;
        this.plugins = projectConfigJson.plugins;
        this.projects = projectConfigJson.projects;
        this.setting = projectConfigJson.setting;
    }

    public static ProjectConfig from(File configFile, String text) {
        ProjectConfigJson projectConfigJson = ProjectConfigJson.from(text);
        ProjectConfig projectConfig = new ProjectConfig(projectConfigJson);
        projectConfig.configFile = configFile;
        projectConfig.projectDir = configFile.getParentFile();
        if (projectConfig.name == null)
            projectConfig.name = configFile.getName();

        return JSON.parseObject(text, ProjectConfig.class);
    }

}
