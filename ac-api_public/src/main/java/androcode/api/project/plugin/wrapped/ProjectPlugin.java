package androcode.api.project.plugin.wrapped;

import androidx.annotation.NonNull;

import androcode.api.project.plugin.IProjectPlugin;

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
