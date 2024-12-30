package taokdao.api.file.template;

import androidx.annotation.NonNull;

import java.io.File;
import java.util.Map;

public interface IFileTemplateGenerator {
    void init();

    /**
     * @param json json文本
     * @return FileTemplate
     * @throws Exception json分析异常
     */
    FileTemplate importFromJson(@NonNull String json) throws Exception;


    /**
     * @param fileTemplate FileTemplate
     * @return json文本
     * @throws Exception json生成异常
     */
    String exportToJson(@NonNull FileTemplate fileTemplate) throws Exception;


    /**
     * @param fileTemplate FileTemplate
     * @param parameters   template参数的值
     * @return 生成后的文本
     */
    String generate(@NonNull FileTemplate fileTemplate, @NonNull Map<String, String> parameters);

    /**
     * @param dir 当前路径
     */
    void showChooseDialog(@NonNull File dir);

    /**
     * @param fileTemplate
     * @param dir          当前路径
     */
    void showGenerateDialog(@NonNull FileTemplate fileTemplate, @NonNull File dir, @NonNull String fileName);

    void create();

    void edit(@NonNull FileTemplate item);

    @NonNull
    File getConfigDir();

    @NonNull
    String getConfigFilePath(@NonNull FileTemplate name);

    void generateFile(@NonNull FileTemplate fileTemplate, @NonNull File file, @NonNull Map<String, String> parameterMap);
}
