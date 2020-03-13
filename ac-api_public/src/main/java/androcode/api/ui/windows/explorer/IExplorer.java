package androcode.api.ui.windows.explorer;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import androcode.api.bean.IProperties;
import androcode.api.setting.preference.base.IPreference;
import androcode.api.ui.windows.explorer.menu.ExplorerMenu;
import androcode.base.fragment.StateFragment;
import androcode.base.identifiable.Identifiable;

public interface IExplorer extends IProperties {

    String getDropDownLabel();

    @Nullable
    @Override
    default String getDescription(){
        return null;
    }

    @Nullable
    Drawable getIcon();

    @Nullable
    Drawable getDropDownIcon();

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
