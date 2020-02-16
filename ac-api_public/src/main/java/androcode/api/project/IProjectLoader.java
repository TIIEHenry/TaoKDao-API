package androcode.api.project;

import androidx.annotation.Nullable;

import java.io.File;
import java.util.List;
import java.util.Map;

public interface IProjectLoader {
    //    void loadProject();
//    void buildProject();
//    void runProject();
    File getProjectConfigFile(File projectDirFile);

    Map<String, File> getProjectStructureMapFromConfigFile(File configFile);

    List<File> getProjectDirListWithDependencies(File projectDirFile);

    @Nullable
    ProjectConfig loadProjectConfigFromFile(File configFile);
}
