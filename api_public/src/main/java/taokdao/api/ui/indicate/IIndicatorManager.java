package taokdao.api.ui.indicate;

import androidx.annotation.NonNull;

public interface IIndicatorManager {
    @NonNull
    IIndicator getStartIndicator();

    @NonNull
    IIndicator getEndIndicator();
}
