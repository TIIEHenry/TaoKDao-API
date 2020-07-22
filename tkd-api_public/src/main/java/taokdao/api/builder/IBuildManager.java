package taokdao.api.builder;

import androidx.annotation.NonNull;

import java.io.File;

import taokdao.api.project.bean.Project;
import taokdao.base.annotation.maintain.ShortTerm;

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
