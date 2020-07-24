package taokdao.api.template.file;

import java.util.List;

public class FileTemplate {

    public String name;
    public String description = "";
    public String group = "";
    public String extension;
    public String templateText;
    public List<String> parameters;

    public FileTemplate() {

    }

    public FileTemplate(String name, String group, String description, String extension, String templateText, List<String> parameters) {
        this.name = name;
        this.group = group;
        this.description = description;
        this.extension = extension;
        this.templateText = templateText;
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return "FileTemplate{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", group='" + group + '\'' +
                ", extension='" + extension + '\'' +
                ", templateText='" + templateText + '\'' +
                ", parameters=" + parameters +
                '}';
    }
}
