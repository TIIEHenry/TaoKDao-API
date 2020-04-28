package taokdao.api.project.bean;

import androidx.annotation.NonNull;

import com.alibaba.fastjson.JSON;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import taokdao.base.annotation.maintain.LongTerm;
import taokdao.base.annotation.todo.NeedSet;

@LongTerm
public class ProjectConfig {
    public static String configFileName = "project.json";
    @NeedSet
    public File projectDir;
    @NeedSet
    public File configFile;
    public String name;
    /**
     * projectBuilder id
     */
    public String builder;
    /**
     * projectPlugin id
     */
    public List<Plugin> plugins = new ArrayList<>();
    public List<RelativePath> projects = new ArrayList<>();
    public Map<String, Object> setting;

    public ProjectConfig() {

    }

    public static ProjectConfig from(String text) {
        return JSON.parseObject(text, ProjectConfig.class);
    }

    public static class Plugin {
        public String id;
        public List<?> parameters;


        @NonNull
        @Override
        public String toString() {
            return "Plugin{id=" + id + ",parameters=" + parameters + "}";
        }
    }


}
