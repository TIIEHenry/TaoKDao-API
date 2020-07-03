package taokdao.api.ui.content.editor.base.ui;

public interface IIMEController {

    void showSoftInput(boolean isShow);

    default void showSoftInput() {
        showSoftInput(true);
    }

    default void hideSoftInput() {
        showSoftInput(false);
    }
}
