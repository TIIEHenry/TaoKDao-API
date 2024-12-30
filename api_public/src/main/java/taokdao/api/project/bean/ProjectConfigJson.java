package taokdao.api.project.bean;

import androidx.annotation.NonNull;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProjectConfigJson {

    public static String configFileName = "project.json";
    public String name;
    public ProjectBuilderJson builder;
    /**
     * project plugins
     */
    public List<ProjectPluginJson> plugins = new ArrayList<>();
    public List<RelativePath> projects = new ArrayList<>();
    public Map<String, Object> setting;


    public ProjectConfigJson() {

    }

    public static ProjectConfigJson from(String text) {
        return JSON.parseObject(text, ProjectConfigJson.class);
    }

    @NonNull
    @Override
    public String toString() {
        return "ProjectConfigJson{" +
               "name='" + name + '\'' +
               ", builder='" + builder + '\'' +
               ", plugins=" + plugins +
               ", projects=" + projects +
               ", setting=" + setting +
               '}';
    }
}
