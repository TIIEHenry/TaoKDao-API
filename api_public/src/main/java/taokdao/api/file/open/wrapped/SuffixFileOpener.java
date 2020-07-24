package taokdao.api.file.open.wrapped;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import taokdao.api.data.bean.Properties;
import taokdao.api.main.IMainContext;
import taokdao.api.ui.content.manage.IContentManager;
import taokdao.base.annotation.relation.MainConstructor;

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
        super(properties, icon, null);
        supportSuffix.addAll(Arrays.asList(suffixes));
        this.click = click;
        this.longClick = longClick;
    }

    public SuffixFileOpener(String[] suffixes, @NonNull Properties properties, @Nullable Drawable icon, @Nullable Callback click) {
        this(suffixes, properties, icon, click, null);
    }

    public SuffixFileOpener(String[] suffixes, @NonNull Properties properties, Callback click) {
        this(suffixes, properties, null, click, null);
    }

    public SuffixFileOpener(String[] suffixes, @NonNull Properties properties) {
        this(suffixes, properties, null, null, null);
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
    public void click(@NonNull IMainContext main, @NonNull IContentManager manager, @NonNull String path) {
        if (click != null)
            click.onAction(main, manager, path);
    }

    @Override
    public boolean longClick(@NonNull IMainContext main, @NonNull IContentManager manager, @NonNull String path) {
        if (longClick != null) {
            longClick.onAction(main, manager, path);
            return true;
        }
        return super.longClick(main, manager, path);
    }

    @Override
    public boolean isSupport(@NonNull String path) {
        return supportSuffix.contains(path.substring(path.lastIndexOf(".") + 1));
    }

    public interface Callback {
        void onAction(IMainContext main, IContentManager manager, String path);
    }
}
