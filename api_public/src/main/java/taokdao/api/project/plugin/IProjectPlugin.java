package taokdao.api.project.plugin;

import androidx.annotation.NonNull;

import java.util.List;

import taokdao.api.base.identifiable.Identifiable;
import taokdao.api.project.bean.Project;

public interface IProjectPlugin extends Identifiable<String> {
    @NonNull
    String id();

    void onProjectOpened(@NonNull Project project, List<?> parameters);

    void onProjectClosed(@NonNull Project project);
}
