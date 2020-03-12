package androcode.api.ui.content.editor.select;

import androidx.annotation.NonNull;

/**
 * @param <I> 位置的数据类型
 */
public interface ICursorController<I> {
    /**
     * @return 光标最小位置
     */
    I getMinIndex();

    /**
     * @return 光标最大位置
     */
    I getMaxIndex();

    I getCurrentIndex();

    void setCurrentIndex(@NonNull I index);
}
