package taokdao.api.project.bean;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;

public class RelativePath {
    public File realFile;
    /**
     * 路径 非一般路径
     */
    @Nullable
    public String alias;

    @NonNull
    public String path;

    public RelativePath() {
    }

    public RelativePath(@Nullable String alias, @NonNull String path) {
        this.alias = alias;
        this.path = path;
    }

    public File getRealFile(@NonNull File projectDir) {
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
        return "RelativePath{" +
                "realFile=" + realFile +
                ", alias='" + alias + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
