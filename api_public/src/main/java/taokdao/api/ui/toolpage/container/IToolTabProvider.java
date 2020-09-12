package taokdao.api.ui.toolpage.container;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import taokdao.api.data.bean.IProperties;
import taokdao.api.ui.toolpage.group.tooltab.IToolTab;

public interface IToolTabProvider extends IProperties {

    @Nullable
    Drawable getIcon();

    @NonNull
    IToolTab provideNewToolTab();
}
