package taokdao.api.builder;

import taokdao.api.main.IMainContext;

public interface IBuildCallback<I> {
    boolean onBuild(IMainContext main, I config, IBuildOption<I> option);
}
