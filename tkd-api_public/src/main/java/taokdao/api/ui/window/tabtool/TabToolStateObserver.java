package taokdao.api.ui.window.tabtool;

import taokdao.base.annotation.maintain.LongTerm;

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
     * 正在添加，还未添加进去
     */
    void onAdding();

    /**
     * 被移除，已经移除
     */
    void onRemoved();
}
