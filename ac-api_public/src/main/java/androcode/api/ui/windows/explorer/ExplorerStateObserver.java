package androcode.api.ui.windows.explorer;

import androcode.base.annotation.maintain.LongTerm;

@LongTerm
public interface ExplorerStateObserver {
    /**
     * 显示
     */
    void onShow();

    /**
     * 隐藏
     */
    void onHide();

    /**
     * 被添加
     */
    void onAdded();

    /**
     * 被移除
     */
    void onRemoved();
}