package taokdao.api.builder.callback;

import androidx.annotation.NonNull;

import taokdao.api.builder.IBuildOption;
import taokdao.api.main.IMainContext;

public interface IBuildCallback<I> {

    boolean onBuild(@NonNull IMainContext main,@NonNull I config,@NonNull IBuildOption<I> option);
}
