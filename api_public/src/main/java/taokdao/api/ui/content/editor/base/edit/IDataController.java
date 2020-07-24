package taokdao.api.ui.content.editor.base.edit;

public interface IDataController<D> {
    D getData();

    void setData(D s);

    boolean isChanged();

    void setChanged(boolean changed);
}
