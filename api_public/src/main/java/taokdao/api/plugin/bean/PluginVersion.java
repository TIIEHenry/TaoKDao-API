package taokdao.api.plugin.bean;

public class PluginVersion {
    public int code;
    public String name;
    public boolean downgrade;

    public void check() throws Exception {
        if (name == null)
            throw new Exception("Version don't have name");
    }

    @Override
    public String toString() {
        return "PluginVersion{" +
               "code=" + code +
               ", name='" + name + '\'' +
               ", downgrade=" + downgrade +
               '}';
    }
}
