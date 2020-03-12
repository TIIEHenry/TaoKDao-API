package androcode.api.ui.content.editor.theme;

public class EditorTheme {
    public String name;

    public int foreground;//前景，文本
    public int background;//背景
    public int background_popup;//背景_编辑器弹出窗口

    public int packages;//包名

    public int line_number;//行号
    public int line_highlight;//当前行
    public int line_warning;//警告
    public int line_error;//警告
    public int line_offset;//行号区域
    public int line_offset_highlight;//行号区域_当前行
    public int line_vertical;//区块竖线
    public int line_vertical_highlight;//区块竖线_当前

    public int scrollbar_slider;//滑块
    public int scrollbar_slider_highlight;//滑块
    public int scrollbar_slideway;//滑道
    public int scrollbar_slideway_highlight;//滑道

    public int text_common;//文本_普通
    public int text_nonprint_background;//文本_空白_背景
    public int text_selected;//文本_已选择
    public int text_selected_background;//文本_已选择_背景

    public int keyword_hard;//硬关键字
    public int keyword_soft;//软关键字

    public int literal_number;//数字
    public int literal_string;//字符串

    public int caret;//选择
    public int caret_highlight;//选择_按下


    public int comment_single;//单行注释
    public int comment_region;//区域注释
    public int comment_doc;//文档注释

    public int identifier_var;//变量
    public int identifier_var_internal;//变量_内置
    public int identifier_func;//函数方法
    public int identifier_func_internal;//函数方法_内置


    public int basic_type;//基本类型
    public int basic_func;//基本方法函数

    public int symbol_common;//符号
    public int symbol_separator;//分隔符号


    public EditorTheme(String name) {
        this.name = name;
    }

}
