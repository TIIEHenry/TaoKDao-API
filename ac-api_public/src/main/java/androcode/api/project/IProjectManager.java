package androcode.api.project;

import java.io.File;

public interface IProjectManager {
    void closeProject();

    void openProject(File ideFile);
}
