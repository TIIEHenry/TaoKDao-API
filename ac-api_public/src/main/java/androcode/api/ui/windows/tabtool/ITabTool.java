package androcode.api.ui.windows.tabtool;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import androcode.api.setting.preference.base.IPreference;
import androcode.base.annotation.Identifier;
import androcode.base.annotation.maintain.LongTerm;
import androcode.base.fragment.StateFragment;

@LongTerm
public interface ITabTool {
//    T newInstance();
//
//    @NonNull
//    String getInstanceName();

    @Identifier
    int id();

    @Nullable
    Drawable getIcon();

    @NonNull
    String getLabel();

    @NonNull
    StateFragment getFragment();

    @NonNull
    ArrayList<TabToolMenu> getMenuList();

    @NonNull
    ArrayList<IPreference<?>> getSettingList();

    /**
     * 管理TabContent的状态，不要用Fragment的生命周期
     */
    @Nullable
    default TabToolStateObserver getStateObserver() {
        return null;
    }
}
