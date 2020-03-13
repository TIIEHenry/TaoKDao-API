package androcode.api.bean;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androcode.api.main.IMainActivity;
import androcode.base.annotation.relation.MainConstructor;

public class Properties {
    @NonNull
    public String id;

    public String label;

    @Nullable
    public String des;

    @MainConstructor
    public Properties(@NonNull String id,String label, @Nullable String description) {
        this.id = id;
        this.label = label;
        this.des = description;
    }

    public Properties(@NonNull String id,String label) {
        this(id, label, null);
    }
    public Properties(@NonNull String id) {
        this(id, null, null);
    }


    public Properties(@NonNull IMainActivity main, @NonNull String id) {
        this(id,null, null);
    }
    public Properties(@NonNull IMainActivity main, @NonNull String id, int label) {
        this(id, main.getString(label), null);
    }

    public Properties(@NonNull IMainActivity main, @NonNull String id, int label, int description) {
        this(id, main.getString(label), main.getString(description));
    }
}
