package taokdao.api.file.build;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;
import java.util.List;

import taokdao.api.builder.IBuilder;

public interface IFileBuilder extends IBuilder<File> {

    @Nullable
    default Drawable getIcon() {
        return null;
    }

    @NonNull
    String getLabel();

    @NonNull
    List<String> getSuffixes();

}
