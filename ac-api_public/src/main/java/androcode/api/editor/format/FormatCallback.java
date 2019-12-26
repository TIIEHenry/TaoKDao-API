package androcode.api.editor.format;

//将允许在线程中
public interface FormatCallback {
    void onDone(String s, int newPos);
    void onError(String s, String errorMsg);
}
