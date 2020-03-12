package androcode.api.project.template;

import androidx.annotation.NonNull;

import androcode.base.annotation.maintain.ShortTerm;


/**
 * 利用ProjectTemplate来创建工程
 */
@ShortTerm
public interface IProjectTemplateCreator {

    void showTemplateDialog();

    void createTemplate(@NonNull IProjectTemplate template);

    void showTemplateInfo(@NonNull IProjectTemplate template);
}
