package androcode.api.ui.content.editor.edit;

import androidx.annotation.NonNull;

public interface IDataController<D> {
    D getData();

    void setData(D s);

    void insertData(@NonNull D s);

    void insertData(@NonNull D s, int index);

}
