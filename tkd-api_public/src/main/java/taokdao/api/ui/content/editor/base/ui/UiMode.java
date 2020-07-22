package taokdao.api.ui.content.editor.base.ui;

import android.content.res.Configuration;

public enum UiMode {
    UI_MODE_NIGHT_NO(Configuration.UI_MODE_NIGHT_NO), UI_MODE_NIGHT_YES(Configuration.UI_MODE_NIGHT_YES);
    public final int code;

    UiMode(int code) {
        this.code = code;
    }
}
