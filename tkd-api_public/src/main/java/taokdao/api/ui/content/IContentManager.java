package taokdao.api.ui.content;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import taokdao.base.annotation.relation.MainMethod;

public interface IContentManager {

    void init();

    /**
     * @param content IContent
     * @param select  显示
     */
    @MainMethod
    void add(@NonNull IContent content, boolean select);

    default void add(@NonNull IContent content) {
        add(content, true);
    }

    void remove(@NonNull IContent content);

    void removeAll(@NonNull List<IContent> contents);

    /**
     * removeAll
     */
    void clear();

    @NonNull
    List<IContent> getList();


    void show(@NonNull IContent content);

    void show(@NonNull String path);

    void show(int index);

    /**
     * @return 当前的tabContent
     */
    @Nullable
    IContent getCurrent();


    void closeCurrent();

    void closeOther();

    void closeAll();

    void closeAllToTheLeft();

    void closeAllToTheRight();

    /**
     * 异步保存当前文件
     */
    void saveCurrentAsync();

    /**
     * 同步保存当前文件
     */
    void saveCurrent();

    /**
     * 异步保存所有文件
     */
    void saveAllAsync();

    /**
     * 同步保存所有文件
     */
    void saveAll();

    /**
     * @param path file
     * @return handled
     */
}
