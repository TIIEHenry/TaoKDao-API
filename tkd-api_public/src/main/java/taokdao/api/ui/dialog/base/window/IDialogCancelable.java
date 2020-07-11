package taokdao.api.ui.dialog.base.window;

public
interface IDialogCancelable<T> {

    /**
     * 设置对话框点击外部是否可消失
     *
     * @param cancelable
     * @return
     */
    T cancelable(boolean cancelable);

    T canceledOnTouchOutside(boolean canceledOnTouchOutside);


}
