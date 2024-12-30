package taokdao.api.builder;

import androidx.annotation.NonNull;

import java.io.File;

import taokdao.api.base.annotation.maintain.ShortTerm;
import taokdao.api.project.bean.Project;

@ShortTerm
public interface IBuildManager {
    void init();

    /**
     * @param buildDefault true 当list为1时自动默认BuildOption
     */
    void buildFile(boolean buildDefault);

    void buildFile(@NonNull File file, boolean buildDefault);

    void buildProject(boolean buildDefault);

    void buildProject(@NonNull Project project, boolean buildDefault);

}
