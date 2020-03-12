package androcode.api.ui.content;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.LinkedHashMap;
import java.util.List;

public interface ITabContentManager {


    /**
     *
     * @param tabContent
     * @param selectNewWin
     * @param opener openerId
     */
    void addTabContent(@NonNull ITabContent tabContent, boolean selectNewWin, @Nullable String opener);

    /**
     * selectNewWin true
     */
    void addTabContent(@NonNull ITabContent tabContent, String opener);

    void removeTabContent(@NonNull ITabContent tabContent);

    /**
     * removeAll
     */
    void clearTabContent();

    boolean selectTabContent(@NonNull ITabContent tabContent);

    boolean selectTabContent(@NonNull String path);

    boolean selectTabContent(int index);

    @NonNull
    List<ITabContent> getTabContentList();

    /**
     *
     * @return 当前的tabContent
     */
    @Nullable
    ITabContent getTabContent();


    LinkedHashMap<String, String> getPathOpenerMap();



    void closeCurrent();

    void closeOther();

    void closeAll();

    void closeAllToTheLeft();

    void closeAllToTheRight();

}
