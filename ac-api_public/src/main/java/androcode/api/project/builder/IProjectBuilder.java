package androcode.api.project.builder;

import androcode.api.builder.IBuilder;
import androcode.api.project.Project;
import androcode.base.identifiable.Identifiable;

public interface IProjectBuilder extends IBuilder<Project>, Identifiable<String> {
}
