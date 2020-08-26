package taokdao.api.ui.toolgroup;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import taokdao.api.base.annotation.maintain.LongTerm;
import taokdao.api.base.fragment.StateFragment;
import taokdao.api.base.identifiable.Identifiable;
import taokdao.api.setting.preference.base.IPreference;
import taokdao.api.ui.toolgroup.callback.ToolGroupStateObserver;
import taokdao.api.ui.toolgroup.menu.ToolGroupMenu;

@LongTerm
public interface IToolGroup extends Identifiable<String> {

    @Nullable
    Drawable getIcon();

    @NonNull
    String getLabel();

    @NonNull
    StateFragment getFragment();

    @NonNull
    ArrayList<ToolGroupMenu> getMenuList();

    @NonNull
    ArrayList<IPreference<?>> getSettingList();

    /**
     * 管理ToolGroup的状态，不要用Fragment的生命周期
     */
    @Nullable
    ToolGroupStateObserver getStateObserver();


}
