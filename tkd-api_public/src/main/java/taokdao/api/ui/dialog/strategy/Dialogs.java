package taokdao.api.ui.dialog.strategy;

import taokdao.api.ui.dialog.strategy.confirm.IConfirmDialogBuilder;
import taokdao.api.ui.dialog.strategy.confirm.IConfirmDialogProvider;
import taokdao.api.ui.dialog.strategy.custom.ICustomDialogBuilder;
import taokdao.api.ui.dialog.strategy.custom.ICustomDialogProvider;
import taokdao.api.ui.dialog.strategy.input.IInputDialogBuilder;
import taokdao.api.ui.dialog.strategy.input.IInputDialogProvider;
import taokdao.api.ui.dialog.strategy.list.IListDialogBuilder;
import taokdao.api.ui.dialog.strategy.list.IListDialogProvider;
import taokdao.api.ui.dialog.strategy.list.regular.IRegularListDialogBuilder;
import taokdao.api.ui.dialog.strategy.loading.ILoadingDialogBuilder;
import taokdao.api.ui.dialog.strategy.loading.ILoadingDialogProvider;
import taokdao.api.ui.dialog.strategy.progress.IProgressDialogBuilder;
import taokdao.api.ui.dialog.strategy.progress.IProgressDialogProvider;

/**
 * confirm 确认框
 * loading 加载框
 * progress 进度框
 * input 输入框
 * list 列表框
 * custom 自定义Layout
 */
public class Dialogs {
    /**
     * input
     */
    public static IInputDialogProvider inputDialogProvider;
    /**
     * custom
     */
    public static ICustomDialogProvider customDialogProvider;
    /**
     * loading
     */
    public static ILoadingDialogProvider loadingDialogProvider;
    /**
     * progress
     */
    public static IProgressDialogProvider progressDialogProvider;
    /**
     * confirm
     */
    public static IConfirmDialogProvider confirmDialogProvider;
    /**
     * list
     */
    public static IListDialogProvider listDialogProvider;


    public static IInputDialogBuilder asInput() {
        return inputDialogProvider.builder();
    }


    public static ICustomDialogBuilder asCustom() {
        return customDialogProvider.builder();
    }


    public static ILoadingDialogBuilder asLoading() {
        return loadingDialogProvider.builder();
    }


    public static IProgressDialogBuilder asProgress() {
        return progressDialogProvider.builder();
    }

    public static IListDialogBuilder asList() {
        return listDialogProvider.builder();
    }

    public static IConfirmDialogBuilder asConfirm() {
        return confirmDialogProvider.builder();
    }
}
