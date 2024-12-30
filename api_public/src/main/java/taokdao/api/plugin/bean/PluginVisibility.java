package taokdao.api.plugin.bean;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PluginVisibility {
    public static final String TYPE_NONE = "TYPE_NONE";
    public static final String TYPE_CONTENT = "TYPE_CONTENT";
    public static final String TYPE_SUFFIX = "TYPE_SUFFIX";
    public static final String TYPE_CONTENT_AND_SUFFIX = "TYPE_CONTENT_AND_SUFFIX";
    public static final String TYPE_CONTENT_OR_SUFFIX = "TYPE_CONTENT_OR_SUFFIX";
    public String type = TYPE_NONE;
    public String[] contents = new String[]{};
    public String[] suffixes = new String[]{};
    public List<String> contentList = new ArrayList<>();
    public List<String> suffixList = new ArrayList<>();

    public PluginVisibility() {
    }

    public boolean isVisible(@Nullable String content, @Nullable String suffix) {
        if (content == null)
            return true;
        switch (type) {
            case TYPE_CONTENT: {
                return contentList.contains(content);
            }
            case TYPE_SUFFIX: {
                if (suffix == null)
                    return false;
                else
                    return suffixList.contains(suffix);
            }
            case TYPE_CONTENT_AND_SUFFIX: {
                if (suffix == null)
                    return false;
                else
                    return contentList.contains(content) && suffixList.contains(suffix);
            }
            case TYPE_CONTENT_OR_SUFFIX: {
                return contentList.contains(content) || (suffix != null && suffixList.contains(suffix));
            }
            default:
                return true;
        }
    }

    public PluginVisibility parse() {
        contentList.addAll(Arrays.asList(contents));
        suffixList.addAll(Arrays.asList(suffixes));
        return this;
    }

    @Override
    public String toString() {
        return "PluginVisibility{" +
               "type='" + type + '\'' +
               ", contents=" + Arrays.toString(contents) +
               ", suffixes=" + Arrays.toString(suffixes) +
               ", contentList=" + contentList +
               ", suffixList=" + suffixList +
               '}';
    }
}
