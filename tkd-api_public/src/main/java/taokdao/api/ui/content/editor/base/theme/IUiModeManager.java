package taokdao.api.ui.content.editor.base.theme;

import androidx.annotation.NonNull;

public interface IUiModeManager {

    void setUiMode(@NonNull UiMode mode);

    @NonNull UiMode getUiMode();
}
