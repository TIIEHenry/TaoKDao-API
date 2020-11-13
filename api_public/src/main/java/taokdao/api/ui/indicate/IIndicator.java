package taokdao.api.ui.indicate;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface IIndicator {
    void setText(@NonNull String text);

    void setVisibility(boolean show);

    @Nullable
    View.OnClickListener getDefaultOnClickListener();

    void setOnClickListener(@Nullable View.OnClickListener onClickListener);

    default void setOnClickListenerDefault() {
        setOnClickListener(getDefaultOnClickListener());
    }

    @Nullable
    View.OnLongClickListener getDefaultOnLongClickListener();

    void setOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener);

    default void setOnLongClickListenerDefault() {
        setOnLongClickListener(getDefaultOnLongClickListener());
    }

}
