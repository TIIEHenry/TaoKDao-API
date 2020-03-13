package androcode.api.file.operator;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androcode.api.bean.IProperties;
import androcode.base.identifiable.Identifiable;

public interface IFileOperator extends IProperties, FileOperatorChecker, FileOperatorCallback {
    @Nullable
    Drawable getIcon();

    @NonNull
    String getLabel();

}
