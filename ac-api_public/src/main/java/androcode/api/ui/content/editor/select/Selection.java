package androcode.api.ui.content.editor.select;

public class Selection extends ISelection<Integer> {

    public Selection(Integer start, Integer end) {
        super(start, end);
    }

    @Override
    public Integer getLen() {
        return end - start;
    }
}
