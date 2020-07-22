package taokdao.api.ui.dialog.strategy;

import taokdao.api.ui.dialog.strategy.confirm.IConfirmDialogBuilder;
import taokdao.api.ui.dialog.strategy.confirm.IConfirmDialogProvider;
import taokdao.api.ui.dialog.strategy.custom.ICustomDialogBuilder;
import taokdao.api.ui.dialog.strategy.custom.ICustomDialogProvider;
import taokdao.api.ui.dialog.strategy.input.IInputDialogBuilder;
import taokdao.api.ui.dialog.strategy.input.IInputDialogProvider;
import taokdao.api.ui.dialog.strategy.list.IListDialogBuilder;
import taokdao.api.ui.dialog.strategy.list.IListDialogProvider;
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
    public static Dialogs global = new Dialogs();

    public static void newInstance() {
        global = new Dialogs();
    }

    /**
     * input
     */
    public IInputDialogProvider inputDialogProvider;

    public static void setInputDialogProvider(IInputDialogProvider inputDialogProvider) {
        global.inputDialogProvider = inputDialogProvider;
    }


    /**
     * custom
     */
    public ICustomDialogProvider customDialogProvider;

    public static void setCustomDialogProvider(ICustomDialogProvider customDialogProvider) {
        global.customDialogProvider = customDialogProvider;
    }

    /**
     * loading
     */
    public ILoadingDialogProvider loadingDialogProvider;

    public static void setLoadingDialogProvider(ILoadingDialogProvider loadingDialogProvider) {
        global.loadingDialogProvider = loadingDialogProvider;
    }

    /**
     * progress
     */
    public IProgressDialogProvider progressDialogProvider;

    public static void setProgressDialogProvider(IProgressDialogProvider progressDialogProvider) {
        global.progressDialogProvider = progressDialogProvider;
    }

    /**
     * confirm
     */
    public IConfirmDialogProvider confirmDialogProvider;

    public static void setConfirmDialogProvider(IConfirmDialogProvider confirmDialogProvider) {
        global.confirmDialogProvider = confirmDialogProvider;
    }

    /**
     * list
     */
    public IListDialogProvider listDialogProvider;

    public static void setListDialogProvider(IListDialogProvider listDialogProvider) {
        global.listDialogProvider = listDialogProvider;
    }

//    public static IInputDialogBuilder asInput() {
//        return global.inputDialogProvider.builder();
//    }
//
//
//    public static ICustomDialogBuilder asCustom() {
//        return global.customDialogProvider.builder();
//    }
//
//
//    public static ILoadingDialogBuilder asLoading() {
//        return global.loadingDialogProvider.builder();
//    }
//
//
//    public static IProgressDialogBuilder asProgress() {
//        return global.progressDialogProvider.builder();
//    }
//
//    public static IListDialogBuilder asList() {
//        return global.listDialogProvider.builder();
//    }
//
//    public static IConfirmDialogBuilder asConfirm() {
//        return global.confirmDialogProvider.builder();
//    }

    public IInputDialogBuilder asInput() {
        return inputDialogProvider.builder();
    }


    public ICustomDialogBuilder asCustom() {
        return customDialogProvider.builder();
    }


    public ILoadingDialogBuilder asLoading() {
        return loadingDialogProvider.builder();
    }


    public IProgressDialogBuilder asProgress() {
        return progressDialogProvider.builder();
    }

    public IListDialogBuilder asList() {
        return listDialogProvider.builder();
    }

    public IConfirmDialogBuilder asConfirm() {
        return confirmDialogProvider.builder();
    }

}
