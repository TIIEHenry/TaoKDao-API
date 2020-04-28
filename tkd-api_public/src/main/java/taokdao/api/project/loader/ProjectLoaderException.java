package taokdao.api.project.loader;

import taokdao.api.project.bean.ProjectConfig;

public class ProjectLoaderException extends Exception {
    public ProjectLoaderException(ProjectConfig config, String message) {
        super("LoadProject(name:" + config.name + ")Failed{" + message + "}");
    }
}
