package taokdao.api.plugin.bridge.invoke;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface IInvoker {
    @Nullable
    String onInvoke(@NonNull String method, @Nullable String params, @Nullable IInvokeCallback invokeCallback);

    @Nullable
    default String onInvoke(@NonNull String method, @Nullable String params) {
        return onInvoke(method, params, null);
    }

    @Nullable
    default String onInvoke(@NonNull String method, @Nullable IInvokeCallback invokeCallback) {
        return onInvoke(method, null, invokeCallback);
    }

    @Nullable
    default String onInvoke(@NonNull String method) {
        return onInvoke(method, null, null);
    }
}
