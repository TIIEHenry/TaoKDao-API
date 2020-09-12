package taokdao.api.ui.toolpage.container.tabchoose;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import taokdao.api.ui.toolpage.group.tooltab.IToolTab;

public interface ITabChooserAdapter {

    void add(@NonNull IToolTab toolTab, boolean select);

    void remove(@NonNull IToolTab toolTab);

    boolean contains(@NonNull IToolTab toolTab);

    void clear();

    /**
     * 显示
     *
     * @param toolTab
     */
    void show(@Nullable IToolTab toolTab);

    @Nullable
    default IToolTab get(@NonNull String id) {
        for (IToolTab toolTab : getAll()) {
            if (id.equals(toolTab.id()))
                return toolTab;
        }
        return null;
    }

    @NonNull
    List<IToolTab> getAll();

}
