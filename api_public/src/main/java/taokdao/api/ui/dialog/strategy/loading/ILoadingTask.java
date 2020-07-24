package taokdao.api.ui.dialog.strategy.loading;

public interface ILoadingTask {
    void onLoading(ILoadingDialog dialog) throws OnLoadingException;
}
