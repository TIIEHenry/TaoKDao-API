package androcode.api.editor.format;

import android.graphics.drawable.Drawable;


public interface Formattable {


    boolean isFormattable();
    /**
     * selectionMode会formatSelection
     * 否则formatAll
     */
    void format();

    void formatAll();

    /**
     * 格式化选择的文本
     */
    void formatSelection();

//    void setFormattedText(CharSequence text,int selIndex);

    /**
     * 替换格式化后的文本
     * @param text 格式化后的文本
     * @param selStart 原光标开始
     * @param selEnd 原光标结束
     */
    void setFormattedText(String text, int selStart, int selEnd);
}
