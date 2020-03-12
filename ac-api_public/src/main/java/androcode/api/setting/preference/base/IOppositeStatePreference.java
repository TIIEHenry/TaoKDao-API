package androcode.api.setting.preference.base;

public interface IOppositeStatePreference extends IPreference<Boolean> {

    void on();

    void off();

    default void load() {
        onToggle(loadValue());
    }

    /**
     * 点击时触发
     *
     * @param isOn 是否处于开启状态
     */
    void onToggle(boolean isOn);

    interface Listener {
        void onToggle(boolean isOn);
    }
}
