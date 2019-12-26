package androcode.api.editor.select;

public class Selection {
    public final int start, len;
    public final int end;

    public Selection(int start, int end) {
        this.start = start;
        this.end=end;
        this.len = end - start;
    }
}