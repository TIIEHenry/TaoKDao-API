package taokdao.api.file.build.wrapped;

import androidx.annotation.NonNull;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import taokdao.api.builder.IBuildOption;
import taokdao.api.data.bean.IProperties;
import taokdao.api.file.build.IFileBuilder;

public class FileBuilder implements IFileBuilder {
    protected final String id;
    public ArrayList<String> suffixes = new ArrayList<>();
    public ArrayList<IBuildOption<File>> buildOptionList = new ArrayList<>();
    protected String label;

    public FileBuilder(@NonNull IProperties properties) {
        id = properties.id();
        label = properties.getLabel();
    }

    @NonNull
    @Override
    public String id() {
        return id;
    }

    @NonNull
    @Override
    public String getLabel() {
        return label;
    }

    @NonNull
    @Override
    public List<String> getSuffixes() {
        return suffixes;
    }

    @NonNull
    @Override
    public List<IBuildOption<File>> getBuildOptionList() {
        return buildOptionList;
    }

}
