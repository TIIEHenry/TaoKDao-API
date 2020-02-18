package androcode.api.explorer;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;

import androcode.api.activity.IMainActivity;
import androcode.api.content.ITabWinManager;

public class FileOpener {
    public final String id;
    @Nullable
    public Drawable icon;
    public String label;
    public String description;
    @Nullable
    public Callback click;
    @Nullable
    public Callback longClick;

    public FileOpener(String id, @Nullable Drawable icon, String label, String description, Callback click) {
        this.id = id;
        this.icon = icon;
        this.label = label;
        this.description = description;
        this.click = click;
    }

    public FileOpener(String id, String label, String description, Callback click) {
        this(id, null, label, description, click);
    }

    public FileOpener(String id, Drawable icon, String label, String description) {
        this(id, icon, label, description, null);
    }

    public FileOpener(String id, String label, String description) {
        this(id, null, label, description, null);
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof FileOpener)
            return id.equals(((FileOpener) obj).id);
        return false;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @NonNull
    @Override
    public String toString() {
        return "id:" + id + super.toString();
    }

    public interface Callback {
        void onAction(IMainActivity main, ITabWinManager manager, File file);
    }
}
