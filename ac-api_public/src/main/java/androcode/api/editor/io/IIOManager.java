package androcode.api.editor.io;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.IOException;
import java.nio.charset.Charset;

public interface IIOManager<D> {
    /**
     * @param path 文件路径
     * @param charset StandardCharsets.UTF_8
     * @throws IOException e
     */
    void save(@NonNull String path, @NonNull Charset charset) throws IOException;

    D read(@NonNull String path, @NonNull Charset charset) throws IOException;

    /**
     * 设置read的数据
     * @param data read的数据
     * @return 是否成功打开
     */
    boolean open(@Nullable D data);

    /**
     *
     * @param path 文件路径
     * @return 文件是否成功关闭，通常是判断save成功与否
     */
    boolean close(@NonNull String path);
}
