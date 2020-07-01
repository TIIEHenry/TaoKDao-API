package taokdao.api.ui.content;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import taokdao.api.data.bean.IProperties;
import taokdao.api.setting.preference.base.IPreference;
import taokdao.api.ui.content.editor.IEditor;
import taokdao.api.ui.content.menu.ContentMenu;
import taokdao.base.annotation.Identifier;
import taokdao.base.annotation.maintain.LongTerm;
import taokdao.base.fragment.StateFragment;

@LongTerm
public interface IContent extends IProperties {
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

    /**
     * 不要改为 IEditor<?,?>
     * 类型冲突
     *
     * @return
     */
    @NonNull
    IEditor getEditor();

    @NonNull
    List<ContentMenu> getMenuList();


    @NonNull
    List<IPreference<?>> getSettingList();

    @NonNull
    String getOpener();

    void setOpener(@NonNull String openerId);

    /**
     * 管理Content的状态，不要用Fragment的生命周期
     */
    @Nullable
    default ContentStateObserver getStateObserver() {
        return null;
    }
}
