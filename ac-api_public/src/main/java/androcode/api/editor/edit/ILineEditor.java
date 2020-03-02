package androcode.api.editor.edit;

public interface ILineEditor<D> {

    /**
     * 选择当前行
     */
    void selectLine();

    /**
     * 选择行
     * @param line 行号
     */
    void selectLine(int line);

    /**
     * 选择多行，从光标开始到结束所在的行
     */
    void selectLines();

    /**
     * 选择多行
     * @param startLine 开始行
     * @param endLine 结束行
     */
    void selectLineRange(int startLine, int endLine);

    //有阴影的只有一行

    /**
     * 删除当前行
     * @return
     */
    D deleteLine();

    D deleteLine(int line);

    D deleteLines();

    D deleteLineRange(int startLine, int endLine);

    D cutLine();

    D cutLine(int line);

    D cutLines();

    D cutLineRange(int startLine, int endLine);


    void copyLine();

    void copyLine(int line);

    void copyLines();

    void copyLineRange(int startLine, int endLine);

    /**
     * 缩进当前行
     */
    void indentLines();

    void indentLineRange(int startLine, int endLine);

    /**
     * 注释当前行
     */
    void noteLine();

    void noteLine(int line);

    /**
     * 文档注释当前行
     */
    void noteLines();

    void noteLineRange(int startLine, int endLine);

    /**
     * @param line 跳转到行
     */
    void gotoLine(int line);

    /**
     * @return 总行数
     */
    int getLineCount();
}
