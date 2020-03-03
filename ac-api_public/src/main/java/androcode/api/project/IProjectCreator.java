package androcode.api.project;

import androidx.annotation.NonNull;

import androcode.api.project.template.ProjectTemplate;


/**
 * 利用ProjectTemplate来创建工程
 */
public interface IProjectCreator {

    void showTemplateDialog();

    void createTemplate(@NonNull ProjectTemplate template);

    void showTemplateInfo(@NonNull ProjectTemplate template);
}
