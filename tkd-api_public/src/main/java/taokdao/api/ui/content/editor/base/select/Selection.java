package taokdao.api.ui.content.editor.base.select;

public class Selection extends ISelection<Integer> {

    public Selection(Integer start, Integer end) {
        super(start, end);
    }

    @Override
    public Integer length() {
        return end - start;
    }
}
