package androcode.api.builder;

import androcode.api.builder.base.IBuilder;
import androcode.api.project.ProjectConfig;

public interface IProjectBuilder extends IBuilder<ProjectConfig> {
    String getId();
}
