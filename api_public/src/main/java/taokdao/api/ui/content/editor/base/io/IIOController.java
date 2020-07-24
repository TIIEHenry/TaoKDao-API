package taokdao.api.ui.content.editor.base.io;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.IOException;

/**
 * open read import
 * export write(writeTo) close
 *
 * @param <D>
 */
public interface IIOController<D> {
    void setReadable(boolean readable);

    boolean canRead();


    void setWritable(boolean writable);

    boolean canWrite();

    /**
     * 获取Opened的path
     *
     * @return
     */
    @Nullable
    String getCurrentPath();

    void setCurrentPath(@Nullable String path);

    /**
     * @param path 文件路径 可能为网络
     * @return 是否成功打开
     */
    boolean open(@NonNull String path);

    @NonNull
    D read() throws IOException;

    /**
     * @param data D
     * @throws Exception e
     */
    void importData(@NonNull D data) throws Exception;

    /**
     * @return data D
     * @throws Exception e
     */
    @NonNull
    D exportData() throws Exception;

    /**
     * @param data 文数据
     * @throws IOException e
     */
    void write(@NonNull D data) throws IOException;

    /**
     * @param data 文数据
     * @param path 文件路径 可能为网络
     * @throws IOException e
     */
    void writeTo(@NonNull D data, @NonNull String path) throws IOException;


    /**
     * @return 文件是否成功关闭，通常是判断save成功与否
     */
    boolean close();
}
