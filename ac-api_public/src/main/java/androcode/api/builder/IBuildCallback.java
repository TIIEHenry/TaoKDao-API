package androcode.api.builder;

import androcode.api.main.IMainActivity;

public interface IBuildCallback<I> {
    boolean onBuild(IMainActivity main, I config, IBuildOption<I> option);
}
