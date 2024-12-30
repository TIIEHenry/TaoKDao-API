package tiiehenry.android.ui.dialogs.api.strategy;

import tiiehenry.android.ui.dialogs.api.strategy.confirm.IConfirmDialogBuilder;
import tiiehenry.android.ui.dialogs.api.strategy.confirm.IConfirmDialogProvider;
import tiiehenry.android.ui.dialogs.api.strategy.custom.ICustomDialogBuilder;
import tiiehenry.android.ui.dialogs.api.strategy.custom.ICustomDialogProvider;
import tiiehenry.android.ui.dialogs.api.strategy.input.IInputDialogBuilder;
import tiiehenry.android.ui.dialogs.api.strategy.input.IInputDialogProvider;
import tiiehenry.android.ui.dialogs.api.strategy.list.IListDialogBuilder;
import tiiehenry.android.ui.dialogs.api.strategy.list.IListDialogProvider;
import tiiehenry.android.ui.dialogs.api.strategy.loading.ILoadingDialogBuilder;
import tiiehenry.android.ui.dialogs.api.strategy.loading.ILoadingDialogProvider;
import tiiehenry.android.ui.dialogs.api.strategy.progress.IProgressDialogBuilder;
import tiiehenry.android.ui.dialogs.api.strategy.progress.IProgressDialogProvider;

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
    /**
     * input
     */
    public IInputDialogProvider inputDialogProvider;
    /**
     * custom
     */
    public ICustomDialogProvider customDialogProvider;
    /**
     * loading
     */
    public ILoadingDialogProvider loadingDialogProvider;
    /**
     * progress
     */
    public IProgressDialogProvider progressDialogProvider;
    /**
     * confirm
     */
    public IConfirmDialogProvider confirmDialogProvider;
    /**
     * list
     */
    public IListDialogProvider listDialogProvider;

    public static void newInstance() {
        global = new Dialogs();
    }

    public static void setInputDialogProvider(IInputDialogProvider inputDialogProvider) {
        global.inputDialogProvider = inputDialogProvider;
    }

    public static void setCustomDialogProvider(ICustomDialogProvider customDialogProvider) {
        global.customDialogProvider = customDialogProvider;
    }

    public static void setLoadingDialogProvider(ILoadingDialogProvider loadingDialogProvider) {
        global.loadingDialogProvider = loadingDialogProvider;
    }

    public static void setProgressDialogProvider(IProgressDialogProvider progressDialogProvider) {
        global.progressDialogProvider = progressDialogProvider;
    }

    public static void setConfirmDialogProvider(IConfirmDialogProvider confirmDialogProvider) {
        global.confirmDialogProvider = confirmDialogProvider;
    }

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
