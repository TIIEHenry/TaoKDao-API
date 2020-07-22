package taokdao.api.project.bean;

import androidx.annotation.NonNull;

import java.io.File;

public class RelativePath {
    public File realFile;
    /**
     * 路径 非一般路径
     */

    public String path;

    public RelativePath() {
    }

    public RelativePath(@NonNull String path) {
        this.path = path;
    }

    public File getRealPathFile(@NonNull File projectDir) {
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

    @Override
    public String toString() {
        return "RelativePath{" +
                "path='" + path + '\'' +
                '}';
    }
}
