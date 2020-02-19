package androcode.api.project;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectConfig {
    public File projectDirFile;
    public File projectConfigFile;

    public String builder="script";
    public List<String> pluginList=new ArrayList<>();

    //compile project "Demo"
    public HashMap<String, Map<String, String>> dependencies = new HashMap<>();
    public HashMap<String, String> structure = new HashMap<>();
    public HashMap<String, String> sources = new HashMap<>();

    public ProjectConfig(File config) {
        projectConfigFile=config;
    }

}
