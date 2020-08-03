package taokdao.api.data.bean;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import taokdao.api.base.annotation.relation.MainConstructor;

public class Properties implements IProperties {
    @NonNull
    public String id;

    public String label;

    @Nullable
    public String des;

    @MainConstructor
    public Properties(@NonNull String id, String label, @Nullable String description) {
        this.id = id;
        this.label = label;
        this.des = description;
    }

    public Properties(@NonNull String id, String label) {
        this(id, label, null);
    }

    public Properties(@NonNull String id) {
        this(id, null, null);
    }

    public Properties(@NonNull String id, @NonNull Context context, int label) {
        this(id, context.getString(label), null);
    }

    public Properties(@NonNull String id, @NonNull Context context, int label, int description) {
        this(id, context.getString(label), context.getString(description));
    }


    @Override
    public String getLabel() {
        return label;
    }

    @Nullable
    @Override
    public String getDescription() {
        return des;
    }

    @NonNull
    @Override
    public String id() {
        return id;
    }
}
