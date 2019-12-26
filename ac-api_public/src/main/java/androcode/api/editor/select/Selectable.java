package androcode.api.editor.select;

import androidx.annotation.Nullable;

public interface Selectable {
    /**
     * 全选
     */
    void selectAll();

    /**
     * 扩选
     */
    void selectMore();

    /**
     * 缩选
     */
    void selectLess();

    /**
     * @return 是否为选择模式
     */
    boolean isInSelectionMode();

    //不在selectionMode时为null
    @Nullable
    Selection getSelection();

    String getSelectedText();
    //光标开始

    /**
     * @return 开始光标
     */
    int getSelectionStart();

    /**
     * @return 结束光标
     */
    int getSelectionEnd();

    String cutSelection();

    String deleteSelection();

    String copySelection();

    void setSelection(int selStart, int selEnd);

    void setSelection(int selection);

    /**
     * 注释选择文本
     */
    public void noteRegion();

    public void noteRegion(int selStart, int selEnd);

    /**
     * 文档注释选择文本
     */
    public void noteDocRegion();

    public void noteDocRegion(int selStart, int selEnd);
}
