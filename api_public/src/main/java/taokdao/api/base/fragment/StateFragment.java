package taokdao.api.base.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import taokdao.api.base.annotation.maintain.LongTerm;

@LongTerm
public abstract class StateFragment extends Fragment {

    private View rootView;
    private Runnable onResumeObserver;
    private Runnable onPauseObserver;
    private boolean initView = false;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (rootView != null) {
            ViewGroup parent = (ViewGroup) rootView.getParent();
            if (null != parent) {
                parent.removeView(rootView);
            }
        } else {
            rootView = getView(inflater, container);
        }
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (rootView != null) {
            ViewGroup parent = (ViewGroup) rootView.getParent();
            if (null != parent) {
//                Log.e(getClass().getSimpleName(), "onDestroyView: "+rootView );
//                if (rootView instanceof ViewGroup)
//                    ((ViewGroup) rootView).removeAllViewsInLayout();
                parent.removeView(rootView);
            }

        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (!initView) {
            initView = true;
            initView(view);
        }
    }

    @NonNull
    protected abstract View getView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container);

    @Override
    public void onResume() {
        super.onResume();
        if (onResumeObserver != null)
            onResumeObserver.run();
    }

    @Override
    public void onPause() {
        super.onPause();
        if (onPauseObserver != null)
            onPauseObserver.run();
    }

    public void setOnResumeObserver(Runnable callback) {
        this.onResumeObserver = callback;
    }

    public void setOnPauseObserver(Runnable callback) {
        this.onPauseObserver = callback;
    }


    public abstract void initView(@NonNull View view);

}
