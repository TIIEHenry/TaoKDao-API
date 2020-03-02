package androcode.api.builder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import androcode.api.main.IMainActivity;
import androcode.api.builder.base.ICallback;
import androcode.api.main.progressbar.ProgressUser;

public abstract class BaseFileTaskBuilder implements IFileTaskBuilder {
    private static final ExecutorService mExecutorService;

    static {
        mExecutorService = Executors.newSingleThreadExecutor();
    }

    private ArrayList<String> suffixs = new ArrayList<>();

    @Override
    public List<String> getSuffixs() {
        return suffixs;
    }

    @Override
    public boolean onRun(final IMainActivity activity, final File config, final ICallback<File> callback) {
        callback.onPrepare();
        mExecutorService.execute(new Runnable() {
            @Override
            public void run() {
                callback.onPrepareInThread();
                ProgressUser.BOTTOM_HORIZONTAL.addUser(config.getAbsolutePath());
                try {
                    runTask(activity, config);
                    callback.onDone(config);
                } catch (Exception e) {
                    e.printStackTrace();
                    callback.onError(e.getMessage());
                } finally {
                    ProgressUser.BOTTOM_HORIZONTAL.removeUser(config.getAbsolutePath());
                }
            }
        });
        return true;
    }

    @Override
    public boolean onBuild(final IMainActivity activity, final File config, final ICallback<File> callback) {
        callback.onPrepare();
        mExecutorService.execute(() -> {
            callback.onPrepareInThread();
            ProgressUser.BOTTOM_HORIZONTAL.addUser(config.getAbsolutePath());
            try {
                buildTask(activity, config);
                callback.onDone(config);
                activity.getActivity().runOnUiThread(() -> {

                });
            } catch (Exception e) {
                e.printStackTrace();
                callback.onError(e.getMessage());
            } finally {
                ProgressUser.BOTTOM_HORIZONTAL.removeUser(config.getAbsolutePath());
            }
        });
        return true;
    }
}
