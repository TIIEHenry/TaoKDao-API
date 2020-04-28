package taokdao.api.template;

import androidx.annotation.NonNull;

import taokdao.base.annotation.maintain.ShortTerm;


/**
 * 利用ProjectTemplate来创建工程
 */
@ShortTerm
public interface ITemplateCreator {

    void showTemplateDialog();

    void createTemplate(@NonNull ITemplate template);

    void showTemplateInfo(@NonNull ITemplate template);
}
