package androcode.api.editor.document;

/**
 * 行号从1开始
 */
public interface Documentable {
    //    String get

    /**
     *
     * @return 总行数,编辑器的行数
     */
    int getRowCount();

    /**
     * 从0开始
     * @return 行号-1
     */
    int getLineNumberForIndex(int index);

    /**
     * 从0开始
     * @return 总行数，代码的行数
     */
    int getLineCount();

    /**
     * @return 行号，从1开始
     */
    int getCurrentLine();
}
