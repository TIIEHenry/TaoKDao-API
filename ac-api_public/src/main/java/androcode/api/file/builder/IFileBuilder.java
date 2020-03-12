package androcode.api.file.builder;

import java.io.File;
import java.util.List;

import androcode.api.builder.IBuilder;

public interface IFileBuilder extends IBuilder<File> {
    List<String> getSuffixes();
}
