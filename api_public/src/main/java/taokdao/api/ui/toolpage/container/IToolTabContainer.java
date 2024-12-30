package taokdao.api.ui.toolpage.container;

import androidx.annotation.NonNull;

import java.util.ArrayList;

import taokdao.api.ui.base.ITab;
import taokdao.api.ui.toolpage.container.tabchoose.ITabChooserAdapter;
import taokdao.api.ui.toolpage.container.tabchoose.TabChooserStyle;
import taokdao.api.ui.toolpage.group.tooltab.IToolTab;

public interface IToolTabContainer<C extends Object> extends ITab<String, IToolTab<C>> {
    void attachAdapter(ITabChooserAdapter toolTabBinder);

    void detachAdapter();

    @NonNull
    ArrayList<IToolTabProvider> getToolTabProviderList();


    @NonNull
    TabChooserStyle getTabChooserStyle();
}
