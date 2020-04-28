package taokdao.api.plugin.bean;

public enum PluginType {
    /**
     * 提供插件引擎的插件
     */
    TYPE_ENGINE("engine"),
    /**
     * 一般插件
     */
    TYPE_COMMON("common");

    public final String name;

    PluginType(String name) {
        this.name = name;
    }
}
