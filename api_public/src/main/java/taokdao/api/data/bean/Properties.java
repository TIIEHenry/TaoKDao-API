package taokdao.api.data.bean;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;

import taokdao.api.base.annotation.relation.MainConstructor;

public class Properties implements IProperties {
    @NonNull
    public String id;

    public String label;

    @Nullable
    public String description;

    @MainConstructor
    public Properties(@NonNull String id, String label, @Nullable String description) {
        this.id = id;
        this.label = label;
        this.description = description;
    }

    public Properties(@NonNull String id, String label) {
        this(id, label, null);
    }

    public Properties(@NonNull String id) {
        this(id, null, null);
    }

    public Properties(@NonNull String id, @NonNull Context context,@StringRes int label) {
        this(id, context.getString(label), null);
    }

    public Properties(@NonNull String id, @NonNull Context context, @StringRes int label, @StringRes int description) {
        this(id, context.getString(label), context.getString(description));
    }


    @Override
    public String getLabel() {
        return label;
    }

    @Nullable
    @Override
    public String getDescription() {
        return description;
    }

    @NonNull
    @Override
    public String id() {
        return id;
    }
}
