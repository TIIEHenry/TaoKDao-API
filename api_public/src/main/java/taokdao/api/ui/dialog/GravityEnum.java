package taokdao.api.ui.dialog;

import android.view.Gravity;
import android.view.View;

/**
 * 对齐方式
 */
public enum GravityEnum {
    START,
    CENTER,
    END;


    public static GravityEnum from(int gravity) {
        switch (gravity) {
            case Gravity.START:
                return START;
            case Gravity.CENTER_HORIZONTAL:
                return CENTER;
            case Gravity.END:
                return END;
            default:
                return START;
        }
    }

    public int getGravityInt() {
        switch (this) {
            case START:
                return Gravity.START;
            case CENTER:
                return Gravity.CENTER_HORIZONTAL;
            case END:
                return Gravity.END;
            default:
                throw new IllegalStateException("Invalid gravity constant");
        }
    }

    public int getTextAlignment() {
        switch (this) {
            case CENTER:
                return View.TEXT_ALIGNMENT_CENTER;
            case END:
                return View.TEXT_ALIGNMENT_VIEW_END;
            default:
                return View.TEXT_ALIGNMENT_VIEW_START;
        }
    }
}
