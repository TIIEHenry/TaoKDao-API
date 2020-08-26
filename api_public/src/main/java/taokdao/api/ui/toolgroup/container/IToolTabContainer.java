package taokdao.api.ui.toolgroup.container;

import androidx.annotation.NonNull;

import java.util.ArrayList;

import taokdao.api.ui.base.ITab;
import taokdao.api.ui.toolgroup.container.tabchoose.ITabChooserAdapter;
import taokdao.api.ui.toolgroup.container.tabchoose.TabChooserStyle;
import taokdao.api.ui.toolgroup.tooltab.IToolTab;

public interface IToolTabContainer extends ITab<String, IToolTab> {
    void attachAdapter(ITabChooserAdapter toolTabBinder);

    void detachAdapter();

    @NonNull
    ArrayList<IToolTabProvider> getToolTabProviderList();


    @NonNull
    TabChooserStyle getTabChooserStyle();
}
