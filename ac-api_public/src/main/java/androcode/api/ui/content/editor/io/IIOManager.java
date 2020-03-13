package androcode.api.ui.content.editor.io;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;
import java.io.IOException;

public interface IIOManager<D> {
    /**
     * @param path 文件路径 可能为网络
     * @throws IOException e
     */
    void write(@NonNull String path) throws IOException;

    D read(@NonNull String path) throws IOException;

    boolean canRead();

    void setReadable(boolean readable);

    boolean canWrite();

    void setWritable(boolean writable);

    /**
     * 设置read的数据
     *
     * @param data read的数据
     * @return 是否成功打开
     */
    boolean open(@Nullable D data);

    /**
     * @param file 文件路径
     * @return 文件是否成功关闭，通常是判断save成功与否
     */
    boolean close(@NonNull File file);
}
