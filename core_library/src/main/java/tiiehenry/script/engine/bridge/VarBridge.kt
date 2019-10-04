package tiiehenry.script.engine.bridge

import tiiehenry.script.engine.bridge.i.IVarBridge
import tiiehenry.script.engine.framework.ScriptEngine

abstract class VarBridge<T,S : ScriptEngine>(engine: S) : Bridge<S>(engine), IVarBridge<T,S> {





//    fun getFunc(name: String): V8Function? {
//        return runtime.get(name) as? V8Function?
//    }

}