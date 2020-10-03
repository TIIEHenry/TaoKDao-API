package taokdao.api.ui.toolpage.group.tooltab.wrapped;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import taokdao.api.base.annotation.Identifier;
import taokdao.api.base.annotation.relation.MultiConstructor;
import taokdao.api.data.bean.IProperties;
import taokdao.api.setting.preference.base.IPreference;
import taokdao.api.ui.toolpage.group.tooltab.IToolTab;
import taokdao.api.ui.toolpage.group.tooltab.ToolTabStateObserver;
import taokdao.api.ui.toolpage.menu.ToolPageMenu;

public class BaseToolTab<C> implements IToolTab<C> {

    @Identifier
    private final String id;
    private final String label;
    private final Drawable icon;
    private final C content;

    private ArrayList<ToolPageMenu> menuList = new ArrayList<>();
    private ArrayList<IPreference<?>> settingList = new ArrayList<>();


    @MultiConstructor
    public BaseToolTab(@NonNull IProperties properties, @Nullable Drawable icon, C content) {
        this.id = properties.id();
        this.label = properties.getLabel();
        this.icon = icon;
        this.content = content;
    }

    @Nullable
    @Override
    public Drawable getIcon() {
        return icon;
    }

    @NonNull
    @Override
    public String getLabel() {
        return label;
    }

    @Nullable
    @Override
    public String getDescription() {
        return null;
    }

    @NonNull
    @Override
    public C getContent() {
        return content;
    }

    @NonNull
    @Override
    public ArrayList<ToolPageMenu> getMenuList() {
        return menuList;
    }

    @NonNull
    @Override
    public ArrayList<IPreference<?>> getSettingList() {
        return settingList;
    }

    @Nullable
    @Override
    public ToolTabStateObserver getStateObserver() {
        return null;
    }

    @NonNull
    @Override
    public String id() {
        return id;
    }
}
