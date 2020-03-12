package androcode.api.ui.windows.tabtool;

import androcode.base.annotation.maintain.LongTerm;

@LongTerm
public interface TabToolStateObserver {
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
