package androcode.api.project.plugin;

import androidx.annotation.NonNull;

public abstract class ProjectPlugin implements IProjectPlugin {
    @NonNull
    private String id;

    public ProjectPlugin(@NonNull String id) {
        this.id = id;
    }

    @NonNull
    @Override
    public String id() {
        return id;
    }
}
