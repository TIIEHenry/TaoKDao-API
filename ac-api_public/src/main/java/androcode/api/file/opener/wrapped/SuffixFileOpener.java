package androcode.api.file.opener.wrapped;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import androcode.api.bean.Properties;
import androcode.api.file.util.FileUtils;
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
    public SuffixFileOpener(String[] suffixes, @NonNull Properties properties, @Nullable Drawable icon, @Nullable Callback click, @Nullable Callback longClick) {
        super(properties,icon, null);
        supportSuffix.addAll(Arrays.asList(suffixes));
        this.click=click;
        this.longClick=longClick;
    }

    public SuffixFileOpener(String[] suffixes, @NonNull Properties properties, @Nullable Drawable icon, @Nullable Callback click) {
        this(suffixes,properties,icon, click,null);
    }

    public SuffixFileOpener(String[] suffixes, @NonNull Properties properties, Callback click) {
        this(suffixes,properties,null, click,null);
    }

    public SuffixFileOpener(String[] suffixes,  @NonNull Properties properties) {
        this(suffixes,properties,null,null,null);
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
