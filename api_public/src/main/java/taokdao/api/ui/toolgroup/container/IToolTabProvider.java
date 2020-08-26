package taokdao.api.ui.toolgroup.container;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import taokdao.api.data.bean.IProperties;
import taokdao.api.ui.toolgroup.tooltab.IToolTab;

public interface IToolTabProvider extends IProperties {

    @Nullable
    Drawable getIcon();

    @NonNull
    IToolTab provideNewToolTab();
}
