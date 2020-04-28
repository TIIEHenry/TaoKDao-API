package taokdao.api.template;

import taokdao.base.identifiable.IdentifiablePool;

public class TemplatePool extends IdentifiablePool<ITemplate, String> {
    private static TemplatePool instance = new TemplatePool();

    public static TemplatePool getInstance() {
        return instance;
    }

    public static TemplatePool newInstance() {
        instance = new TemplatePool();
        return instance;
    }
}
