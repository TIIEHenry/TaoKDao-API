package androcode.api.editor.select;

public abstract class ISelection<I> {
    public final I start;
    public final I end;

    public ISelection(I start, I end) {
        this.start = start;
        this.end=end;
    }
    public abstract I getLen();
}