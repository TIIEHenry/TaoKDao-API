package taokdao.api.data.bean;

import androidx.annotation.Nullable;

import taokdao.api.base.identifiable.Identifiable;

public interface IProperties extends Identifiable<String> {

    String getLabel();

    @Nullable
    String getDescription();
}
