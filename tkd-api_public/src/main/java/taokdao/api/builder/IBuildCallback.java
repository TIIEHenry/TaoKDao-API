package taokdao.api.builder;

import taokdao.api.main.IMainActivity;

public interface IBuildCallback<I> {
    boolean onBuild(IMainActivity main, I config, IBuildOption<I> option);
}
