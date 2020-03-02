package androcode.api.editor;

import android.graphics.drawable.Drawable;


public interface IFormatter<D> {


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
     * 替换格式化后的数据
     * @param data 格式化后的数据
     * @param selStart 原光标开始
     * @param selEnd 原光标结束
     */
    void setFormattedData(D data, int selStart, int selEnd);
}
