package androcode.api.project.template;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import androcode.api.project.template.ProjectTemplate;

public class ProjectTemplateSet {

    public static HashMap<String, ProjectTemplate> map = new HashMap<>();

    /**
     * @param id id
     * @param o  ProjectTemplate
     * @return isSuccess
     */
    public static boolean add(@NonNull String id, @NonNull ProjectTemplate o) {
        if (map.get(id) == null) {
            map.put(id, o);
            return true;
        }
        return false;
    }

    public static ProjectTemplate remove(@NonNull String id) {
        return map.remove(id);
    }

    public static void removeAll(@NonNull ProjectTemplate template) {
        ArrayList<String> keys = new ArrayList<>();
        for (String s : map.keySet()) {
            ProjectTemplate o = map.get(s);
            if (o == template)
                keys.add(s);
        }
        for (String k : keys) {
            map.remove(k);
        }
    }

    public static boolean contains(@NonNull String id) {
        return map.get(id) != null;
    }

    public static HashSet<ProjectTemplate> getAll() {
        return new HashSet<>(map.values());
    }

    public static void clear() {
        map.clear();
    }
}
