package taokdao.api.ui.toolpage.fragment;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import taokdao.api.data.bean.IProperties;

public abstract class ViewToolGroupFragment extends BaseToolGroupFragment<View> {


    public ViewToolGroupFragment(@NonNull IProperties properties, @Nullable Drawable icon, View layout) {
        super(properties, icon, layout);
    }

    public ViewToolGroupFragment(@NonNull IProperties properties, View layout) {
        super(properties, layout);
    }

    public ViewToolGroupFragment(@NonNull IProperties properties, @Nullable Drawable icon, int layoutId) {
        super(properties, icon, layoutId);
    }

    public ViewToolGroupFragment(@NonNull IProperties properties, int layoutId) {
        super(properties, layoutId);
    }

    public abstract ViewGroup getViewContainer();

    @Override
    public void attachContent(@NonNull View content) {
        getViewContainer().addView(content, -1, -1);
    }

    @Override
    public void detachContent(@NonNull View content) {
        ((ViewGroup) content.getParent()).removeView(content);
    }

    @Override
    public boolean isContentAttached(@NonNull View content) {
        return content.getParent() != null;
    }
}
