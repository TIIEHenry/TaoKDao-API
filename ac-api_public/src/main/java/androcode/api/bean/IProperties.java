package androcode.api.bean;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androcode.base.identifiable.Identifiable;

public interface IProperties extends Identifiable<String> {

    String getLabel();

    @Nullable
    String getDescription();
}
