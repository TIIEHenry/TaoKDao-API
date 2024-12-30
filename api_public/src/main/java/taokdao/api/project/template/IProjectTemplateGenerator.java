package taokdao.api.project.template;

import androidx.annotation.NonNull;

import java.io.File;

import taokdao.api.base.annotation.maintain.ShortTerm;


/**
 * 利用ProjectTemplate来创建工程
 */
@ShortTerm
public interface IProjectTemplateGenerator {

    /**
     * @param dir 当前路径
     */
    void showChooseDialog(@NonNull File dir);

    void generate(@NonNull IProjectTemplate template, @NonNull File dir);

    void showInfo(@NonNull IProjectTemplate template);
}
