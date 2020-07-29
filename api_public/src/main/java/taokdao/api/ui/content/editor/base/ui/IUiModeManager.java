package taokdao.api.ui.content.editor.base.ui;

import androidx.annotation.NonNull;

public interface IUiModeManager {

    @NonNull
    UiMode getUiMode();

    void setUiMode(@NonNull UiMode mode);
}
