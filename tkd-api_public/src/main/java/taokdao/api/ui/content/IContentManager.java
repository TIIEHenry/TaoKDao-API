package taokdao.api.ui.content;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.LinkedHashMap;
import java.util.List;

import taokdao.base.annotation.impl.InternalImpl;
import taokdao.base.annotation.maintain.ShortTerm;
import taokdao.base.annotation.relation.MainMethod;

public interface IContentManager {

    @NonNull
    IContentIOController getIOController();

    /**
     * @param content IContent
     * @param select  显示
     * @param opener  openerId
     */
    @MainMethod
    void add(@NonNull IContent content, boolean select, @Nullable String opener);

    default void add(@NonNull IContent content, boolean select) {
        add(content, select, null);
    }

   default void add(@NonNull IContent content, String opener) {
        add(content, true, opener);
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

    @InternalImpl
    @ShortTerm
    LinkedHashMap<String, String> getPathOpenerMap();

}
