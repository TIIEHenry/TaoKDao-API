package taokdao.api.setting.theme;

public interface IThemeManager {

    /**
     * 系统为深色或设置为深色
     *
     * @return
     */
    boolean shouldDark();

    boolean isSystemDark();

    int getThemeId(boolean dark);

    /**
     * 获取正在使用的真实UI模式
     */
    ThemeMode getCurrentUIMode();

    /**
     * 设置正在使用的真实UI模式
     * 只有两种
     *
     * @param mode ThemeMode
     */
    void setCurrentUIMode(ThemeMode mode);

    default void saveCurrentUIMode() {
        if (shouldDark())
            setCurrentUIMode(ThemeMode.DARK);
        else
            setCurrentUIMode(ThemeMode.LIGHT);
    }

    default int getThemeId() {
        return getThemeId(shouldDark());
    }

}
