package androcode.api.main.drawerbottom;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

public class TabFragmentViewPager extends ViewPager {
    public static int dp2px(float dpValue) {
        return (int) (0.5f + dpValue * Resources.getSystem().getDisplayMetrics().density);
    }

    public TabFragmentViewPager(@NonNull Context context) {
        super(context);
        init();
    }

    public TabFragmentViewPager(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    private void init() {
        setTouchEdge(20, 40, 55);
    }

    public void setTouchEdge(int horizontal, int top, int bottom) {
        touchEdgeHorizontal = dp2px(horizontal);
        touchEdgeTop = dp2px(top);
        touchEdgeBottom = dp2px(bottom);
    }


    //判断点击区域是否在HorizontalScrollView
    public boolean isTouchInRect(MotionEvent ev) {
        RectF rect = calcViewScreenLocation();
        return rect.contains(ev.getX(), ev.getY());
    }

    private static int touchEdgeHorizontal = 100;
    private static int touchEdgeTop = 100;
    private static int touchEdgeBottom = 100;

    public RectF calcViewScreenLocation() {
        // 获取控件在屏幕中的位置，返回的数组分别为控件左顶点的 x、y 的值
        return new RectF(touchEdgeHorizontal, touchEdgeTop, getWidth() - touchEdgeHorizontal,
                getHeight() - touchEdgeBottom);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (isTouchInRect(ev)) {
            //交给child处理
            return false;
        }
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_MOVE:
                break;
            case MotionEvent.ACTION_UP:
                super.onInterceptTouchEvent(ev);
                return false;
        }

        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean canScrollVertically(int direction) {
        return false;
    }
}
