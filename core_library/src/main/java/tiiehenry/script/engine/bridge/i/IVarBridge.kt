package tiiehenry.script.engine.bridge.i

import tiiehenry.script.engine.framework.ScriptEngine

interface IVarBridge<T,S : ScriptEngine>: IBridge<S> {
    fun getType(name: String): T

    fun getVar(name: String): Any?

    fun getString(name: String): String?

    fun getBoolean(name: String): Boolean?

    fun getInteger(name: String): Int?

    fun getFloat(name: String): Float?

    fun getDouble(name: String): Double?

    fun putVar(name: String, value: Any?)

    fun putString(name: String, value: String)

    fun putBoolean(name: String, value: Boolean)

    fun putInteger(name: String, value: Int)

    fun putFloat(name: String, value: Float)

    fun putDouble(name: String, value: Double)
}