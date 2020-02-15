package androcode.api.explorer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FileOpenerManager {
    private static class SingletonInner {
        private static FileOpenerManager instance = new FileOpenerManager();
    }

    public static FileOpenerManager getInstance() {
        return SingletonInner.instance;
    }

    private FileOpenerManager() {

    }


    public HashMap<String, Set<FileOpener>> map = new HashMap<>();

    /**
     * @param suffix 后缀
     * @param opener fileopener
     * @return issuccess
     */
    public boolean add(String suffix, FileOpener opener) {
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

    public void add(String[] suffix, FileOpener opener) {
        for (String s : suffix) {
            add(s, opener);
        }
    }

    public Set<FileOpener> get(String suffix) {
        Set<FileOpener> list = map.get(suffix);
        if (list == null) {
            list = new HashSet<>();
            map.put(suffix, list);
        }
        return list;
    }


    public boolean remove(String suffix, FileOpener opener) {
        Set<FileOpener> list = map.get(suffix);
        if (list == null) {
            return false;
        }
        return list.remove(opener);
    }

    public boolean remove(String suffix, String id) {
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

    public void remove(String[] suffixs, FileOpener opener) {
        for (String s : suffixs) {
            remove(s, opener);
        }
    }

    public void remove(String[] suffixs, String id) {
        for (String s : suffixs) {
            remove(s, id);
        }
    }

    public void clear() {
        map.clear();
    }
}
