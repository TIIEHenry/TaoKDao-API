package androcode.api.menu;

import androidx.recyclerview.widget.RecyclerView;

import java.util.HashMap;

public enum ExplorerMenuSet {
    PROJECT_STRUCRURE,
    PROJECT_FILES,
    FILE_EXPLORER,
    FILE_EXPLORER_UPPER;
    //view
    public RecyclerView.Adapter adapter;


    //use it
    public HashMap<String,ExplorerMenu> map = new HashMap<>();

}
