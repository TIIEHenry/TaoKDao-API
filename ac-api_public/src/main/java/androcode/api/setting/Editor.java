package androcode.api.setting;

import android.content.SharedPreferences;

public class Editor {


    public static void init(SharedPreferences sp) {
        AutoSave.enable = sp.getBoolean("Editor.AutoSave.enable", true);
        AutoSave.onPause = sp.getBoolean("Editor.AutoSave.onPause", false);
        AutoSave.onStop = sp.getBoolean("Editor.AutoSave.onStop", true);
        Appearance.isWordWrap = sp.getBoolean("Editor.Appearance.isWordWrap", false);
        Appearance.useTab = sp.getBoolean("Editor.Appearance.useTab", true);
        Appearance.isShowMagnifier = sp.getBoolean("Editor.Appearance.isShowMagnifier", true);
        Block.isShowLineNumbers = sp.getBoolean("Editor.Block.isShowLineNumbers", true);
        Block.isShowLineOffset = sp.getBoolean("Editor.Block.isShowLineOffset", true);
        Block.isShowBlockRegionLines = sp.getBoolean("Editor.Block.isShowBlockRegionLines", true);
        Block.isShowBlockRegionHighlightLine = sp.getBoolean("Editor.Block.isShowBlockRegionHighlightLine", true);
        try {
            Appearance.textSize = Integer.parseInt(sp.getString("Editor.Appearance.textSize", "15"));
            Appearance.tabLength = Integer.parseInt(sp.getString("Editor.Appearance.tabLength", "3"));
            Appearance.autoIndentWidth = Integer.parseInt(sp.getString("Editor.Appearance.autoIndentWidth", "1"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        Appearance.fontDirPath = sp.getString("Editor.Appearance.fontDirPath", WorkSpace.Dir.Editor.fontDir);
    }

    public static class AutoSave {
        public static boolean enable;
        public static boolean onPause;
        public static boolean onStop;
    }

    public static class Appearance {
        public static int textSize = 15;
        public static boolean isWordWrap;
        public static boolean useTab;
        public static int tabLength = 3;
        public static int autoIndentWidth = 2;
        public static String fontDirPath;
        public static boolean isShowMagnifier;
    }

    public static class Block {
        public static boolean isShowLineNumbers;
        public static boolean isShowLineOffset;
        public static boolean isShowBlockRegionLines;
        public static boolean isShowBlockRegionHighlightLine;
    }

}
