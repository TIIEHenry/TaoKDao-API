package taokdao.api.data.language;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface ILanguageLoader<T> {
    /**
     * @param source source file or data
     * @return this
     */
    @Nullable
    ILanguageLoader<T> input(@NonNull T source);

    /**
     * @return source file or data
     */
    @Nullable
    T output();

    /**
     * @param id id
     * @return str with id in currentLanguageCountry or currentLanguage or default Language
     */
    @NonNull
    default String get(@NonNull String id) {
        return get(id, getCurrentLanguage());
    }

    default void set(@NonNull String id, @NonNull String str) {
        set(id, getCurrentLanguage(), str);
    }

    /**
     * @param id       id
     * @param language language
     * @return str with id in currentLanguageCountry or currentLanguage or default Language
     */
    @NonNull
    String get(@NonNull String id, @NonNull String language);

    void set(@NonNull String id, @NonNull String language, @NonNull String str);


    @NonNull
    default String getDefault(@NonNull String id) {
        return get(id, getDefaultLanguage());
    }

    default void setDefault(@NonNull String id, @NonNull String str) {
        set(id, getDefaultLanguage(), str);
    }

    /**
     * @return languageCountry like zh-CN
     */
    @NonNull
    String getCurrentLanguage();

    /**
     * @param language like zh-CN
     */
    void setCurrentLanguage(@NonNull String language);

    /**
     * @return languageCountry like zh-CN
     */
    @NonNull
    String getDefaultLanguage();

    /**
     * @param language like zh-CN
     */
    void setDefaultLanguage(@NonNull String language);


}
