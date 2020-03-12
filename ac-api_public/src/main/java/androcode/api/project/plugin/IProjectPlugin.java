package androcode.api.project.plugin;

import androidx.annotation.NonNull;

import java.util.List;

import androcode.api.project.Project;
import androcode.base.identifiable.Identifiable;

public interface IProjectPlugin extends Identifiable<String> {
    @NonNull
    String id();

    void onProjectOpened(@NonNull Project project, List<?> parameters);

    void onProjectClosed(@NonNull Project project);
}
