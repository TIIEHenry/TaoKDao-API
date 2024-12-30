package taokdao.api.ui.explorer;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import taokdao.api.base.fragment.StateFragment;
import taokdao.api.data.bean.IProperties;
import taokdao.api.setting.preference.base.IPreference;
import taokdao.api.ui.explorer.callback.ExplorerStateObserver;
import taokdao.api.ui.explorer.menu.ExplorerMenu;

public interface IExplorer extends IProperties {

    @Nullable
    Drawable getIcon();

    @Nullable
    @Override
    default String getDescription() {
        return null;
    }

    @NonNull
    StateFragment getFragment();

    @NonNull
    ArrayList<ExplorerMenu> getMenuList();

    @NonNull
    ArrayList<IPreference<?>> getSettingList();

    @Nullable
    default ExplorerStateObserver getStateObserver() {
        return null;
    }

}
