package androcode.api.plugin.engine;

import androidx.annotation.NonNull;

import androcode.api.bean.IProperties;
import androcode.api.plugin.Plugin;
import androcode.base.identifiable.Identifiable;

public interface IPluginEngine extends IProperties {

    void onCreateEngine();

    void onDestroyEngine();

//    void onLoadModule();

    void onLoadPlugin(@NonNull Plugin plugin);

    void onInitPlugin(@NonNull Plugin plugin);

    void onCallPlugin(@NonNull Plugin plugin);

    void onDestroyPlugin(@NonNull Plugin plugin);
}
