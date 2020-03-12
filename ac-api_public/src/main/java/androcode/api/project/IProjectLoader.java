package androcode.api.project;

import androidx.annotation.NonNull;

import java.io.File;

public interface IProjectLoader {
    default File getProjectConfigFile(File projectDir) {
        return new File(projectDir, ProjectConfig.configFileName);
    }

    @NonNull
    default ProjectConfig loadProjectConfigFromDir(@NonNull File projectDir) throws Exception {
        return loadProjectConfigFromFile(getProjectConfigFile(projectDir));
    }

    @NonNull
    ProjectConfig loadProjectConfigFromFile(@NonNull File configFile) throws Exception;

    @NonNull
    Project loadProject(@NonNull ProjectConfig config) throws ProjectLoaderException;
}
