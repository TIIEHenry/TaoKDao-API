package androcode.api.editor.io;

import java.io.IOException;

public interface IOManager<T> {
    void save(String path, String charsetName) throws IOException;

    T read(String path, String charsetName) throws IOException;

    boolean open(T data);

    boolean close(String path);
}
