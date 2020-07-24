package taokdao.api.project.bean;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class RelativeAliasPaths {
    /**
     * 别名
     */
    @Nullable
    public String alias;


    public List<RelativePath> paths;

    public RelativeAliasPaths() {
    }

    public RelativeAliasPaths(@Nullable String alias, List<RelativePath> paths) {
        this.alias = alias;
        this.paths = paths;
    }

    @NonNull
    public List<File> getRealPathFileList(@NonNull File projectDir) {
        ArrayList<File> list = new ArrayList<>();
        for (RelativePath path : paths) {
            list.add(path.getRealPathFile(projectDir));
        }
        return list;
    }

    @Override
    public String toString() {
        return "RelativePaths{" +
                "alias='" + alias + '\'' +
                ", paths=" + paths +
                '}';
    }
}
