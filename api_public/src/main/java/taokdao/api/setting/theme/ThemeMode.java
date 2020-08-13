package taokdao.api.setting.theme;

import androidx.annotation.StringRes;

import taokdao.api.api_public.R;


public enum ThemeMode {
    SYSTEM(R.string.main_setting_darkmode_followsystem), LIGHT(R.string.main_setting_darkmode_locklight), DARK(R.string.main_setting_darkmode_lockdark);
    /**
     * 设置项
     */
    public static ThemeMode current = SYSTEM;
    public static ThemeMode[] list = new ThemeMode[]{SYSTEM, LIGHT, DARK};
    public final int id;

    ThemeMode(@StringRes int id) {
        this.id = id;
    }

    public boolean isSystem() {
        return this == SYSTEM;
    }

    public boolean isLight() {
        return this == LIGHT;
    }

    public boolean isDark() {
        return this == DARK;
    }
}
