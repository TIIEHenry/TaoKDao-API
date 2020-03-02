package com.xuexiang.xui.widget.dialog.materialdialog;

import android.graphics.drawable.Drawable;
import android.os.Build;

import androidx.core.content.res.ResourcesCompat;

import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.widget.dialog.materialdialog.util.RippleHelper;

import tiiehenry.androcode.api.main.R;


public class MDDialog extends MaterialDialog {
    public MDDialog(Builder builder) {
        super(builder);
    }

    @Override
    Drawable getButtonSelector(DialogAction which, boolean isStacked) {
        if (isStacked) {
            if (builder.btnSelectorStacked != 0) {
                return ResourcesCompat.getDrawable(
                        builder.context.getResources(), builder.btnSelectorStacked, getContext().getTheme());
            }
            final Drawable d =
                    ThemeUtils.resolveDrawable(builder.context, R.attr.md_btn_stacked_selector);
            if (d != null) {
                return d;
            }
            return ThemeUtils.resolveDrawable(getContext(), R.attr.md_btn_stacked_selector);
        } else {
            Drawable d;
            if(which==DialogAction.NEUTRAL){
                if (builder.btnSelectorNeutral != 0) {
                    return ResourcesCompat.getDrawable(
                            builder.context.getResources(), builder.btnSelectorNeutral, getContext().getTheme());
                }
                d = ThemeUtils.resolveDrawable(builder.context, R.attr.md_btn_neutral_selector);
                if (d != null) {
                    return d;
                }
                d = ThemeUtils.resolveDrawable(getContext(), R.attr.md_btn_neutral_selector);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    RippleHelper.applyColor(d, builder.buttonRippleColor);
                }
            }else if(which==DialogAction.NEGATIVE){
                if (builder.btnSelectorNegative != 0) {
                    return ResourcesCompat.getDrawable(
                            builder.context.getResources(), builder.btnSelectorNegative, getContext().getTheme());
                }
                d = ThemeUtils.resolveDrawable(builder.context, R.attr.md_btn_negative_selector);
                if (d != null) {
                    return d;
                }
                d = ThemeUtils.resolveDrawable(getContext(), R.attr.md_btn_negative_selector);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    RippleHelper.applyColor(d, builder.buttonRippleColor);
                }
            }else {
                if (builder.btnSelectorPositive != 0) {
                    return ResourcesCompat.getDrawable(
                            builder.context.getResources(), builder.btnSelectorPositive, getContext().getTheme());
                }
                d = ThemeUtils.resolveDrawable(builder.context, R.attr.md_btn_positive_selector);
                if (d != null) {
                    return d;
                }
                d = ThemeUtils.resolveDrawable(getContext(), R.attr.md_btn_positive_selector);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    RippleHelper.applyColor(d, builder.buttonRippleColor);
                }
            }
            return d;
        }
    }
}
