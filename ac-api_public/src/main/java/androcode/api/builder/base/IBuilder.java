package androcode.api.builder.base;

import androcode.api.activity.IMainActivity;

public interface IBuilder<I> {
    boolean onRun(IMainActivity activity, I config, ICallback<I> callback);

    boolean onBuild(IMainActivity activity, I config, ICallback<I> callback);
}
