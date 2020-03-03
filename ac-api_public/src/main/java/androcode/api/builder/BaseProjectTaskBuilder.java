package androcode.api.builder;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import androcode.api.main.IMainActivity;
import androcode.api.builder.base.ICallback;
import androcode.api.main.progressbar.ProgressUsers;
import androcode.api.project.ProjectConfig;

public abstract class BaseProjectTaskBuilder implements IProjectTaskBuilder {
    private static final ExecutorService mExecutorService;

    static {
        mExecutorService = Executors.newSingleThreadExecutor();
    }


    @Override
    public boolean onRun(final IMainActivity activity, final ProjectConfig config, final ICallback<ProjectConfig> callback) {
        callback.onPrepare();
        mExecutorService.execute(new Runnable() {
            @Override
            public void run() {
                callback.onPrepareInThread();
                ProgressUsers.BOTTOM_HORIZONTAL.addUser(config.projectDirFile.getAbsolutePath());
                try {
                    runTask(activity, config);
                    callback.onDone(config);
                } catch (Exception e) {
                    e.printStackTrace();
                    callback.onError(e.getMessage());
                } finally {
                    ProgressUsers.BOTTOM_HORIZONTAL.removeUser(config.projectDirFile.getAbsolutePath());
                }
            }
        });
        return true;
    }

    @Override
    public boolean onBuild(final IMainActivity activity, final ProjectConfig config, final ICallback<ProjectConfig> callback) {
        callback.onPrepare();
        mExecutorService.execute(new Runnable() {
            @Override
            public void run() {
                callback.onPrepareInThread();
                ProgressUsers.BOTTOM_HORIZONTAL.addUser(config.projectDirFile.getAbsolutePath());
                try {
                    buildTask(activity, config);
                    callback.onDone(config);
                } catch (Exception e) {
                    e.printStackTrace();
                    callback.onError(e.getMessage());
                } finally {
                    ProgressUsers.BOTTOM_HORIZONTAL.removeUser(config.projectDirFile.getAbsolutePath());
                }
            }
        });
        return true;
    }

}
