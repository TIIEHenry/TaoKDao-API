package taokdao.api.file.operate;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import taokdao.api.data.bean.IProperties;

public interface IFileOperator extends IProperties, FileOperatorChecker, FileOperatorCallback {
    @Nullable
    Drawable getIcon();

    @NonNull
    String getLabel();

}
