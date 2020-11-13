package taokdao.api.project.bean;

import androidx.annotation.NonNull;

import java.util.List;

public class ProjectBuilderJson {
    public String id;
    public List<String> parameters;

    public ProjectBuilderJson() {
    }

    @NonNull
    @Override
    public String toString() {
        return "ProjectBuilderJson{id=" + id + ",parameters=" + parameters + "}";
    }
}
