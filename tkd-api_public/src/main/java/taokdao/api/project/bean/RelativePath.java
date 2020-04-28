package taokdao.api.project.bean;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;

public class RelativePath {
    /**
     * 别名
     */
    @Nullable
    public String alias;

    /**
     * 路径 非一般路径
     */
    public String path;

    private File realFile = null;

    public RelativePath() {
    }

    public RelativePath(@Nullable String alias, String path) {
        this.alias = alias;
        this.path = path;
    }

    public File getRealPath(File projectDir) {
        if (realFile == null) {
            if (path.startsWith("/")) {
                realFile = new File(path);
            } else {
                String paths = path;
                while (paths.startsWith("../")) {
                    if (projectDir.getParentFile() != null)
                        projectDir = projectDir.getParentFile();
                    paths = paths.substring(3);
                }
                realFile = new File(projectDir, paths);
            }
        }
        return realFile;
    }

    @NonNull
    @Override
    public String toString() {
        return "Path{alias=" + alias + ",path=" + path + "}";
    }
}
