package androcode.api.ui.content;

import androcode.base.annotation.maintain.LongTerm;

@LongTerm
public interface ITabContentStateObserver {
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
    void onAdd();

    /**
     * 被移除，已经移除
     */
    void onRemove();
}
