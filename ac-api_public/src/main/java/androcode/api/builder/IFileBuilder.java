package androcode.api.builder;

import java.io.File;
import java.util.List;

import androcode.api.builder.base.IBuilder;

public interface IFileBuilder extends IBuilder<File> {
    List<String> getSuffixs();
}
