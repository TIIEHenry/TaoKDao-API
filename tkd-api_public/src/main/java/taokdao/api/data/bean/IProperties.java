package taokdao.api.data.bean;

import androidx.annotation.Nullable;

import taokdao.base.identifiable.Identifiable;

public interface IProperties extends Identifiable<String> {

    String getLabel();

    @Nullable
    String getDescription();
}
