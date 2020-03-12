package androcode.api.project;

public class ProjectLoaderException extends Exception {
    public ProjectLoaderException(ProjectConfig config, String message) {
        super("LoadProject(name:" + config.name + ")Failed{" + message + "}");
    }
}
