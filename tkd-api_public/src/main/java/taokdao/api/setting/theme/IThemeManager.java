package taokdao.api.setting.theme;

public interface IThemeManager {
    boolean isDark();

    int getTheme(boolean dark);

    default int getTheme() {
        return getTheme(isDark());
    }

}
