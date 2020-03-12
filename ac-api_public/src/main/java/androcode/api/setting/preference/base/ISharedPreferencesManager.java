package androcode.api.setting.preference.base;


import android.content.SharedPreferences;

import androidx.annotation.NonNull;

import androcode.api.plugin.loader.PluginManifest;
import androcode.api.ui.content.ITabContent;
import androcode.api.ui.windows.explorer.IExplorer;
import androcode.api.ui.windows.tabtool.ITabTool;

/**
 * 保存各种设置
 */
public interface ISharedPreferencesManager {
    /**
     * app设置
     */
    @NonNull
    SharedPreferences getApplicationPreference();

    @NonNull
    default SharedPreferences getPluginPreference(@NonNull PluginManifest pluginManifest) {
        return getPreference("plugin_" + pluginManifest.id);
    }

    @NonNull
    default SharedPreferences getTabContentPreference(@NonNull ITabContent tabContent) {
        return getPreference("tabcontent_" + tabContent.id());
    }

    @NonNull
    default SharedPreferences getTabToolPreference(@NonNull ITabTool tabTool) {
        return getPreference("tabtool_" + tabTool.id());
    }

    @NonNull
    default SharedPreferences getExplorerPreference(@NonNull IExplorer explorer) {
        return getPreference("explorer_" + explorer.id());
    }

    @NonNull
    SharedPreferences getPreference(@NonNull String name);
}
