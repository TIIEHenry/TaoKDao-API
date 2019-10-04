package tiiehenry.script.engine.bridge.i

import tiiehenry.script.engine.eval.OnExceptionListener
import tiiehenry.script.engine.framework.ScriptEngine

interface IFuncBridge<T, S : ScriptEngine> : IBridge<S> {
    fun callFunc(func: T, vararg args: Any): Any?

    fun callVoidFunc(func: T, vararg args: Any)

    fun callStringFunc(func: T, vararg args: Any): String?

    fun callIntegerFunc(func: T, vararg args: Any): Int?

    fun callFloatFunc(func: T, vararg args: Any): Float?

    fun callDoubleFunc(func: T, vararg args: Any): Double?

    fun callBooleanFunc(func: T, vararg args: Any): Boolean?

    fun callFuncL(func: T, listener: OnExceptionListener, vararg args: Any): Any?

    fun callVoidFuncL(func: T, listener: OnExceptionListener, vararg args: Any)

    fun callStringFuncL(func: T, listener: OnExceptionListener, vararg args: Any): String?

    fun callIntegerFuncL(func: T, listener: OnExceptionListener, vararg args: Any): Int?

    fun callFloatFuncL(func: T, listener: OnExceptionListener, vararg args: Any): Float?

    fun callDoubleFuncL(func: T, listener: OnExceptionListener, vararg args: Any): Double?

    fun callBooleanFuncL(func: T, listener: OnExceptionListener, vararg args: Any): Boolean?
}