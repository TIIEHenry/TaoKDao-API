package androcode.api.file.operator;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androcode.base.identifiable.Identifiable;

public interface IFileOperator extends Identifiable<String>, FileOperatorChecker, FileOperatorCallback {
    @Nullable
    Drawable getIcon();

    @NonNull
    String getLabel();

}
