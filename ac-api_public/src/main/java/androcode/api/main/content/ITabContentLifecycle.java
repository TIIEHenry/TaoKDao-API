package androcode.api.main.content;

public interface ITabContentLifecycle {
    void onStart();

    void onStop();

    void onResume();

    void onPause();

    void onAdded();

    void onRemoved();
}
