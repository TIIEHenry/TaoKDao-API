package androcode.api.project;

import java.util.ArrayList;
import java.util.HashMap;

public class ProjectTemplateManager {
    public static ProjectTemplateManager instance = new ProjectTemplateManager();

    public static ProjectTemplateManager newInstance() {
        instance = new ProjectTemplateManager();
        return instance;
    }

    public HashMap<String, ProjectTemplate> map = new HashMap<>();

    /**
     * @param id id
     * @param o  fileopener
     * @return issuccess
     */
    public boolean addProjectTemplate(String id, ProjectTemplate o) {
        if (map.get(id) == null) {
            map.put(id, o);
            return true;
        }
        return false;
    }

    public ProjectTemplate removeProjectTemplate(String id) {
        return map.remove(id);
    }


    public void removeProjectTemplate(ProjectTemplate template) {
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

}
