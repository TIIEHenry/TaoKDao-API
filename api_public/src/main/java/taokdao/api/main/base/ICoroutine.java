package taokdao.api.main.base;

import androidx.annotation.NonNull;

/**
 * 推荐使用
 */
public interface ICoroutine {

    /**
     * 在UI线程中运行
     *
     * @param runnable
     */
    void runOnMain(@NonNull Runnable runnable);

    /**
     * 在IO线程中运行，为IO优化
     *
     * @param runnable
     */
    void runOnIO(@NonNull Runnable runnable);
}
