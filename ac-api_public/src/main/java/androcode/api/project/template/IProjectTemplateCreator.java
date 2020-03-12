package androcode.api.project.template;

import androidx.annotation.NonNull;


/**
 * 利用ProjectTemplate来创建工程
 */
public interface IProjectTemplateCreator {

    void showTemplateDialog();

    void createTemplate(@NonNull IProjectTemplate template);

    void showTemplateInfo(@NonNull IProjectTemplate template);
}
