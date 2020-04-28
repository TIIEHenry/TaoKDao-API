package taokdao.api.file.builder;

import java.io.File;
import java.util.List;

import taokdao.api.builder.IBuilder;

public interface IFileBuilder extends IBuilder<File> {
    List<String> getSuffixes();
}
