package taokdao.api.main.base;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public interface IActivity extends IContext, IWindow {

    AppCompatActivity getActivity();

    void runOnUIThread(@NonNull Runnable runnable);

}
