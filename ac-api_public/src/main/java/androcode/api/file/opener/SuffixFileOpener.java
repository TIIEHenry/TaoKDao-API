package androcode.api.file.opener;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import androcode.api.file.FileUtils;
import androcode.api.main.IMainActivity;
import androcode.api.ui.content.ITabContentManager;
import androcode.base.annotation.relation.MainConstructor;

/**
 * FileOpener的包装，根据文件后缀匹配
 */
public class SuffixFileOpener extends FileOpener {
    @Nullable
    public Callback click;
    @Nullable
    public Callback longClick;

    public List<String> supportSuffix = new ArrayList<>();

    @MainConstructor
    public SuffixFileOpener(String[] suffixes, String id, @Nullable Drawable icon, String label, String description, Callback click) {
        super(id, icon, label, description, null);
        supportSuffix.addAll(Arrays.asList(suffixes));
    }

    public SuffixFileOpener(String[] suffixes, String id, String label, String description, Callback click) {
        this(suffixes, id, null, label, description, click);
    }

    public SuffixFileOpener(String[] suffixes, String id, Drawable icon, String label, String description) {
        this(suffixes, id, icon, label, description, null);
    }

    public SuffixFileOpener(String[] suffixes, String id, String label, String description) {
        this(suffixes, id, null, label, description, null);
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof SuffixFileOpener)
            return id.equals(((SuffixFileOpener) obj).id);
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

    @Override
    public void click(@NonNull IMainActivity main, @NonNull ITabContentManager manager, @NonNull File file) {
        if (click != null)
            click.onAction(main, manager, file);
    }

    @Override
    public boolean longClick(@NonNull IMainActivity main, @NonNull ITabContentManager manager, @NonNull File file) {
        if (longClick != null) {
            longClick.onAction(main, manager, file);
            return true;
        }
        return super.longClick(main, manager, file);
    }

    @Override
    public boolean isSupport(@NonNull File file) {
        return supportSuffix.contains(FileUtils.getSuffix(file));
    }

    public interface Callback {
        void onAction(IMainActivity main, ITabContentManager manager, File file);
    }
}
