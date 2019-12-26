package androcode.api.explorer;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import androcode.api.activity.IMainActivity;
import androcode.api.tabwin.ITabWinManager;

public class FileOpener {
    public final String id;
    public Drawable icon;
    public String label;
    public String description;
    public Callback click;
    public Callback longClick;

    public FileOpener(String id, Drawable icon, String label, String description, Callback click) {
        this.id = id;
        this.icon = icon;
        this.label = label;
        this.description = description;
        this.click = click;
    }

    public FileOpener(String id, String label, String description, Callback click) {
        this(id, null, label, description, click);
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

    public static HashMap<String, Set<FileOpener>> map = new HashMap<>();

    /**
     * @param suffix 后缀
     * @param opener fileopener
     * @return issuccess
     */
    public static boolean add(String suffix, FileOpener opener) {
        Set<FileOpener> list = map.get(suffix);
        if (list == null) {
            list = new HashSet<>();
            map.put(suffix, list);
        }
        FileOpener fileOpener = null;
        for (FileOpener o : list) {
            if (o.id.equals(opener.id)) {
                fileOpener = o;
            }
        }
        if (fileOpener != null)
            list.remove(opener);
        return list.add(opener);
    }

    public static void add(String[] suffix, FileOpener opener) {
        for (String s : suffix) {
            add(s, opener);
        }
    }

    public static Set<FileOpener> get(String suffix) {
        Set<FileOpener> list = map.get(suffix);
        if (list == null) {
            list = new HashSet<>();
            map.put(suffix, list);
        }
        return list;
    }


    public static boolean remove(String suffix, FileOpener opener) {
        Set<FileOpener> list = map.get(suffix);
        if (list == null) {
            return false;
        }
        return list.remove(opener);
    }

    public static boolean remove(String suffix, String id) {
        Set<FileOpener> list = map.get(suffix);
        if (list == null) {
            return false;
        }
        FileOpener fileOpener = null;
        for (FileOpener o : list) {
            if (o.id.equals(id)) {
                fileOpener = o;
            }
        }
        if (fileOpener == null)
            return false;
        return list.remove(fileOpener);
    }

    public static void remove(String[] suffixs, FileOpener opener) {
        for (String s : suffixs) {
            remove(s, opener);
        }
    }

    public static void remove(String[] suffixs, String id) {
        for (String s : suffixs) {
            remove(s, id);
        }
    }
    public static void clear() {
        map.clear();
    }
}
