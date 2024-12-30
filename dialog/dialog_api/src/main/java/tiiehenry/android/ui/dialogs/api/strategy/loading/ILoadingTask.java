package tiiehenry.android.ui.dialogs.api.strategy.loading;

public interface ILoadingTask {
    void onLoading(ILoadingDialog dialog) throws OnLoadingException;
}
