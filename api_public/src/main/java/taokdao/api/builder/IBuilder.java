package taokdao.api.builder;

import androidx.annotation.NonNull;

import java.util.List;

import taokdao.api.base.identifiable.Identifiable;

public interface IBuilder<I> extends Identifiable<String> {

    @NonNull
    List<IBuildOption<I>> getBuildOptionList();

    @NonNull
    default IBuildOption<I> getDefaultBuildOption() {
        return getBuildOptionList().get(0);
    }

}
