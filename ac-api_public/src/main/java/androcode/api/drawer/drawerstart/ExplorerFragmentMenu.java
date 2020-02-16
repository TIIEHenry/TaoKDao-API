package androcode.api.drawer.drawerstart;

import android.graphics.drawable.Drawable;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ExplorerFragmentMenu {
    @Nullable
    public final Drawable icon;
    @NonNull
    public final String label;
    @NonNull
    public final ExplorerFragmentMenu.Callback click;
    @Nullable
    public final ExplorerFragmentMenu.Callback longClick;


    public ExplorerFragmentMenu(@Nullable Drawable icon, @NonNull String label, @NonNull ExplorerFragmentMenu.Callback click, @Nullable ExplorerFragmentMenu.Callback longClick) {
        this.icon = icon;
        this.label = label;
        this.click = click;
        this.longClick = longClick;
    }

    public ExplorerFragmentMenu(Drawable icon, String label, ExplorerFragmentMenu.Callback click) {
        this(icon, label, click, null);
    }

    @NonNull
    public String toString() {
        return "ExplorerMenus(icon=" + this.icon + ", label=" + this.label + ", click=" + this.click + ", longClick=" + this.longClick + ")";
    }

    public interface Callback {
        void onAction(@NonNull ExplorerFragmentMenu data, View view);
    }
}
