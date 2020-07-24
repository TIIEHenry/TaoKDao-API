package taokdao.api.project.load;

import taokdao.api.project.bean.ProjectConfig;

public class ProjectLoadException extends Exception {
    public ProjectLoadException(ProjectConfig config, String message) {
        super("LoadProjectFailed{name:" + config.name + ",message:" + message + "}");
    }
}
