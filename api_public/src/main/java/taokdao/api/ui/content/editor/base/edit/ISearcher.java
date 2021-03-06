package taokdao.api.ui.content.editor.base.edit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import taokdao.api.ui.content.editor.base.select.ISelection;

public interface ISearcher<D, I> {
    void showFinder();

    void hideFinder();

    void showReplacer();

    void hideReplacer();

    @Nullable
    ISelection<I> findPrior(@NonNull D data, @NonNull I index, @NonNull I start, @NonNull I end);

    @Nullable
    ISelection<I> findNext(@NonNull D data, @NonNull I index, @NonNull I start, @NonNull I end);

    @NonNull
    List<ISelection<I>> findAll(@NonNull D data, @NonNull I index, @NonNull I start, @NonNull I end);

    @NonNull
    List<ISelection<I>> replaceAll(@NonNull D origin, @NonNull D target, @NonNull I index, @NonNull I start, @NonNull I end);


}
