package taokdao.api.setting.theme.resource;

import android.graphics.drawable.Drawable;

import taokdao.api.main.IMainContext;

/**
 * hint 提示性
 * accent 强调性
 */
public class ThemeDrawables {

    /**
     * 矩形
     */
    public int rectangleBackground;
    public int rectangleNormal;
    public int rectangleSelected;
    public int rectangleSelector;
    /**
     * 圆形
     */
    public int roundBackground;
    public int roundNormal;
    public int roundSelected;
    public int roundSelector;

    public ThemeDrawables() {
    }

    public Drawable getRectangleBackground(IMainContext context) {
        return context.getDrawable(rectangleBackground);
    }

    public Drawable getRectangleNormal(IMainContext context) {
        return context.getDrawable(rectangleNormal);
    }

    public Drawable getRectangleSelected(IMainContext context) {
        return context.getDrawable(rectangleSelected);
    }

    public Drawable getRectangleSelector(IMainContext context) {
        return context.getDrawable(rectangleSelector);
    }

    public Drawable getRoundBackground(IMainContext context) {
        return context.getDrawable(roundBackground);
    }

    public Drawable getRoundNormal(IMainContext context) {
        return context.getDrawable(roundNormal);
    }

    public Drawable getRoundSelected(IMainContext context) {
        return context.getDrawable(roundSelected);
    }

    public Drawable getRoundSelector(IMainContext context) {
        return context.getDrawable(roundSelector);
    }

}
