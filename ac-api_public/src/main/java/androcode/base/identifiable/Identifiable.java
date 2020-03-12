package androcode.base.identifiable;

import androidx.annotation.NonNull;

public interface Identifiable<D> {
    @NonNull
    D id();
}
