package tiiehenry.android.ui.dialogs.api.strategy.progress;

import androidx.annotation.NonNull;

import java.text.NumberFormat;

public interface IDialogProgress<T> {

    /**
     * Makes this dialog a progress dialog.
     *
     * @param indeterminate If true, an infinite circular spinner is shown. If false, a horizontal
     *                      progress bar is shown that is incremented or set via the built MaterialDialog instance.
     * @param max           When indeterminate is false, the max value the horizontal progress bar can get to.
     * @return An instance of the Builder so calls can be chained.
     */
    T progress(boolean indeterminate, int max);

    /**
     * Makes this dialog a progress dialog.
     *
     * @param indeterminate If true, an infinite circular spinner is shown. If false, a horizontal
     *                      progress bar is shown that is incremented or set via the built MaterialDialog instance.
     * @param max           When indeterminate is false, the max value the horizontal progress bar can get to.
     * @param showMinMax    For determinate dialogs, the min and max will be displayed to the left
     *                      (start) of the progress bar, e.g. 50/100.
     * @return An instance of the Builder so calls can be chained.
     */
    T progress(boolean indeterminate, int max, boolean showMinMax);

    /**
     * hange the format of the small text showing current and maximum units of progress. The default
     * is "%1d/%2d".
     */
    T progressNumberFormat(@NonNull String format);

    /**
     * Change the format of the small text showing the percentage of progress. The default is
     * NumberFormat.getPercentageInstance().
     */
    T progressPercentFormat(@NonNull NumberFormat format);

    /**
     * By default, indeterminate progress dialogs will use a circular indicator. You can change it
     * to use a horizontal progress indicator.
     */
    T progressIndeterminateStyle(boolean horizontal);

}
