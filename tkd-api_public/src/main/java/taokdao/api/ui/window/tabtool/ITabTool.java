package taokdao.api.ui.window.tabtool;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import taokdao.api.data.bean.IProperties;
import taokdao.api.setting.preference.base.IPreference;
import taokdao.api.ui.window.tabtool.menu.TabToolMenu;
import taokdao.base.annotation.maintain.LongTerm;
import taokdao.base.fragment.StateFragment;

@LongTerm
public interface ITabTool extends IProperties {

    @Nullable
    Drawable getIcon();

    @NonNull
    String getLabel();

    @Nullable
    @Override
    default String getDescription() {
        return null;
    }

    @NonNull
    StateFragment getFragment();

    @NonNull
    ArrayList<TabToolMenu> getMenuList();

    @NonNull
    ArrayList<IPreference<?>> getSettingList();

    /**
     * 管理TabTool的状态，不要用Fragment的生命周期
     */
    @Nullable
    default TabToolStateObserver getStateObserver() {
        return null;
    }
}
