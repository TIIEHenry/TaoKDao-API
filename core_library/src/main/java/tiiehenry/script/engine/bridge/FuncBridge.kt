package tiiehenry.script.engine.bridge

import tiiehenry.script.engine.bridge.i.IFuncBridge
import tiiehenry.script.engine.framework.ScriptEngine

abstract class FuncBridge<T, S : ScriptEngine>(engine: S) : Bridge<S>(engine), IFuncBridge<T, S> {
    val onExceptionListener = engine.onExceptionListener


    override fun callFunc(func: T, vararg args: Any): Any? {
        return callFuncL(func, onExceptionListener, args)
    }

    override fun callVoidFunc(func: T, vararg args: Any) {
        callVoidFuncL(func, onExceptionListener, args)
    }

    override fun callStringFunc(func: T, vararg args: Any): String? {
        return callStringFuncL(func, onExceptionListener, args)
    }

    override fun callIntegerFunc(func: T, vararg args: Any): Int? {
        return callIntegerFuncL(func, onExceptionListener, args)
    }

    override fun callFloatFunc(func: T, vararg args: Any): Float? {
        return callFloatFuncL(func, onExceptionListener, args)
    }

    override fun callDoubleFunc(func: T, vararg args: Any): Double? {
        return callDoubleFuncL(func, onExceptionListener, args)
    }

    override fun callBooleanFunc(func: T, vararg args: Any): Boolean? {
        return callBooleanFuncL(func, onExceptionListener, args)
    }

//    fun getFunc(name: String): V8Function? {
//        return runtime.get(name) as? V8Function?
//    }
/*private var setTimeOutCallback: JavaCallback = JavaCallback { _, v8Array ->
    val v8Function = v8Array.getObject(0) as V8Function
    val time = v8Array.getInteger(1).toLong()
    val taskId = Random.nextInt(1000, 9999)
    val task = v8Executor.schedule({
        v8Function.call(runtime, null)
    }, time, TimeUnit.MILLISECONDS)
    taskId
}*/

}