package androcode.api.ui.content.editor.edit;

public interface IDataController<D> {
    D getData();

    void setData(D s);

    boolean isChanged();

    void setChanged(boolean changed);
}
