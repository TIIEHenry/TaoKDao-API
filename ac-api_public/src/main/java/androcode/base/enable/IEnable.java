package androcode.base.enable;

public interface IEnable {
    void enable();

    void disable();

    boolean isEnabled();

    default void setEnable(boolean e) {
        if (e) enable();
        else disable();
    }
}
