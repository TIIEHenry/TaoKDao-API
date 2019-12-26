package androcode.api.editor.edit;

public interface TextEditable {
    String getString();

    void insert(String s);

    void setText(CharSequence s, boolean keepHistory);

    int getLineCount();
}
