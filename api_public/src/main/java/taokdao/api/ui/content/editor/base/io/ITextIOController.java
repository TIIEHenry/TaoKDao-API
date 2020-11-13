package taokdao.api.ui.content.editor.base.io;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.nio.charset.Charset;

public interface ITextIOController<D> extends IIOController<D> {
    @NonNull
    Charset getDefaultCharset();

    @Nullable
    Charset getCurrentCharset();

    /**
     * @param charset null for auto detect
     */
    void setReadCharset(@Nullable Charset charset);

    @Nullable
    Charset getReadCharset();

    /**
     * @param charset null for read charset
     */
    void setWriteCharset(@Nullable Charset charset);

    @Nullable
    Charset getWriteCharset();

    /**
     * @param charset charset for reading
     */
    void reloadWith(@NonNull Charset charset) throws Exception;

    /**
     * @param charset target charset
     */
    void convertTo(@NonNull Charset charset);
}
