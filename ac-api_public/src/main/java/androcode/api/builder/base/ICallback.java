package androcode.api.builder.base;

public interface ICallback<I> {
    void onPrepare();

    void onPrepareInThread();

    void onDone(I config);

    void onError(String msg);

    public static final class DefaultImpls {
        public static void onPrepare(ICallback $this) {
        }

        public static void onPrepareInThread(ICallback $this) {
        }
    }
}
