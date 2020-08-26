package taokdao.api.ui.toolgroup.tooltab;

public interface ToolTabStateObserver {
    /**
     * 已显示
     */
    void onShown();
    /**
     * 已隐藏
     */
    void onHidden();

    /**
     * 已添加
     */
    void onAdded();

    /**
     * 已移除
     */
    void onRemoved();
}
