package taokdao.api.ui.toolpage.container.wrapped;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import taokdao.api.base.annotation.Identifier;
import taokdao.api.base.annotation.relation.MultiConstructor;
import taokdao.api.data.bean.IProperties;
import taokdao.api.ui.toolpage.container.IToolTabProvider;
import taokdao.api.ui.toolpage.group.tooltab.IToolTab;

public class ToolTabProvider implements IToolTabProvider {
    @Identifier
    private final String id;
    private final String label;
    private final String description;
    private final Drawable icon;
    private final Provider provider;


    @MultiConstructor
    public ToolTabProvider(@NonNull IProperties properties, @Nullable Drawable icon, @NonNull Provider provider) {
        this.id = properties.id();
        this.label = properties.getLabel();
        this.description = properties.getDescription();
        this.icon = icon;
        this.provider = provider;
    }

    public ToolTabProvider(@NonNull IProperties properties, @NonNull Provider provider) {
        this(properties, null, provider);
    }

    @NonNull
    @Override
    public IToolTab provideNewToolTab() {
        return provider.provideNewToolTab();
    }

    @NonNull
    @Override
    public String id() {
        return id;
    }

    @Nullable
    @Override
    public Drawable getIcon() {
        return icon;
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

    public interface Provider {
        @NonNull
        IToolTab provideNewToolTab();
    }
}
