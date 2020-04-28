package taokdao.api.project.builder;

import taokdao.api.builder.IBuilder;
import taokdao.api.project.bean.Project;
import taokdao.base.identifiable.Identifiable;

public interface IProjectBuilder extends IBuilder<Project>, Identifiable<String> {
}
