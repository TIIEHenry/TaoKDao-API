package androcode.api.builder;

import android.view.View;

import androidx.annotation.NonNull;

import java.io.File;

import androcode.api.project.Project;
import androcode.base.annotation.maintain.ShortTerm;

@ShortTerm
public interface IBuilderManager {
    /**
     * @param view         弹窗的秒点控件
     * @param buildDefault true 当list为1时自动默认BuildOption
     */
    void buildFile(@NonNull View view, boolean buildDefault);

    void buildFile(@NonNull View view, @NonNull File file, boolean buildDefault);

    void buildProject(@NonNull View view, boolean buildDefault);

    void buildProject(@NonNull View view, @NonNull Project project, boolean buildDefault);

}
