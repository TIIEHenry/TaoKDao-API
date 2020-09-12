package taokdao.api.ui.toolpage.group.tooltab;

import android.graphics.drawable.Drawable;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import taokdao.api.base.annotation.maintain.LongTerm;
import taokdao.api.data.bean.IProperties;
import taokdao.api.setting.preference.base.IPreference;
import taokdao.api.ui.toolpage.menu.ToolPageMenu;


@LongTerm
public interface IToolTab<C> extends IProperties {

    @Nullable
    Drawable getIcon();

    @NonNull
    String getLabel();

    /**
     * 显示的数据
     *
     * @return
     */
    @NonNull
    C getContent();

    @NonNull
    ArrayList<ToolPageMenu> getMenuList();

    @NonNull
    ArrayList<IPreference<?>> getSettingList();

    /**
     * 管理TabTool的状态，不要用Fragment的生命周期
     */
    @Nullable
    ToolTabStateObserver getStateObserver();
}

