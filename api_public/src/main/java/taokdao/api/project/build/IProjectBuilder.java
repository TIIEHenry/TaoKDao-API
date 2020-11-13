package taokdao.api.project.build;

import androidx.annotation.NonNull;

import java.util.List;

import taokdao.api.builder.IBuilder;
import taokdao.api.project.bean.Project;

public interface IProjectBuilder extends IBuilder<Project> {
    void loadParameters(@NonNull List<String> parameters);
}
