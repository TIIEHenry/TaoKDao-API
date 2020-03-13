package androcode.api.ui.content;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import androcode.api.bean.IProperties;
import androcode.api.setting.preference.base.IPreference;
import androcode.api.ui.content.editor.IEditor;
import androcode.api.ui.content.menu.TabContentMenu;
import androcode.base.annotation.Identifier;
import androcode.base.annotation.maintain.LongTerm;
import androcode.base.fragment.StateFragment;

@LongTerm
public interface ITabContent extends IProperties {
    @Nullable
    default Drawable getIcon() {
        return null;
    }

    @Nullable
    @Override
    default String getDescription() {
        return null;
    }

    @NonNull
    String getLabel();

    @Identifier
    @NonNull
    String getPath();

    @NonNull
    StateFragment getFragment();

    @NonNull
    IEditor getEditor();

    @NonNull
    List<TabContentMenu> getMenuList();


    @NonNull
    List<IPreference<?>> getSettingList();

    /**
     * 管理TabContent的状态，不要用Fragment的生命周期
     */
    @Nullable
    default ITabContentStateObserver getStateObserver() {
        return null;
    }
}
