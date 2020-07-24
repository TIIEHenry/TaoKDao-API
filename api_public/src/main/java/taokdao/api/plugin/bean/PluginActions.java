package taokdao.api.plugin.bean;

public enum PluginActions {
    /**
     * 升级降级
     * 版本最新的插件才会调用，而且是直接调用
     * 不走onCreate流程
     * onUpGrade在新安装的插件中调用
     * onDownGrade在旧的插件中调用
     */
    onUpGrade, onDownGrade,
    /**
     * 创建销毁
     */
    onCreate, onDestroy,
    /**
     * 初始化，触发
     */
    onInit, onCall,
    /**
     * 暂停，恢复
     */
    onPause, onResume
}
