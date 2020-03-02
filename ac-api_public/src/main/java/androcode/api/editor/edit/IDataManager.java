package androcode.api.editor.edit;

import androidx.annotation.NonNull;

public interface IDataManager<D> {
    D getData();

    void setData(D s);

    void insertData(@NonNull D s);

    void insertData(@NonNull D s, int index);

}
