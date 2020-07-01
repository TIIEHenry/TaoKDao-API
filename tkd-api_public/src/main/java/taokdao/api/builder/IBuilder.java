package taokdao.api.builder;

import androidx.annotation.NonNull;

import java.util.List;

import taokdao.base.identifiable.Identifiable;

public interface IBuilder<I>  {

    @NonNull
    List<IBuildOption<I>> getBuildOptionList();

    @NonNull
    default IBuildOption<I> getDefaultBuildOption() {
        return getBuildOptionList().get(0);
    }

}
