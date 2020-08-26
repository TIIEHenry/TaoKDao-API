package taokdao.api.ui.toolgroup.tooltab;

import android.graphics.drawable.Drawable;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import taokdao.api.base.annotation.maintain.LongTerm;
import taokdao.api.data.bean.IProperties;
import taokdao.api.setting.preference.base.IPreference;
import taokdao.api.ui.toolgroup.menu.ToolGroupMenu;


@LongTerm
public interface IToolTab extends IProperties {

    @Nullable
    Drawable getIcon();

    @NonNull
    String getLabel();

    /**
     * 显示的布局视图
     *
     * @return
     */
    @NonNull
    View getContent();

    @NonNull
    ArrayList<ToolGroupMenu> getMenuList();

    @NonNull
    ArrayList<IPreference<?>> getSettingList();

    /**
     * 管理TabTool的状态，不要用Fragment的生命周期
     */
    @Nullable
    ToolTabStateObserver getStateObserver();
}

