package tiiehenry.script.engine.eval

import tiiehenry.script.engine.framework.ScriptEngine

interface StringEvalable<T : ScriptEngine> : Evalable<T> {

    fun evalString(code: String, scriptName: String? = null, lineNumber: Int = 0): Any?

    fun evalVoidString(code: String, scriptName: String? = null, lineNumber: Int = 0)

    fun evalStringString(code: String, scriptName: String? = null, lineNumber: Int = 0): String?

    fun evalIntegerString(code: String, scriptName: String? = null, lineNumber: Int = 0): Int?

    fun evalFloatString(code: String, scriptName: String? = null, lineNumber: Int = 0): Float?

    fun evalDoubleString(code: String, scriptName: String? = null, lineNumber: Int = 0): Double?

    fun evalBooleanString(code: String, scriptName: String? = null, lineNumber: Int = 0): Boolean?

    fun evalString(code: String, scriptName: String? = null, lineNumber: Int = 0, listener: OnExceptionListener): Any?

    fun evalVoidString(code: String, scriptName: String? = null, lineNumber: Int = 0, listener: OnExceptionListener)

    fun evalStringString(code: String, scriptName: String? = null, lineNumber: Int = 0, listener: OnExceptionListener): String?

    fun evalIntegerString(code: String, scriptName: String? = null, lineNumber: Int = 0, listener: OnExceptionListener): Int?

    fun evalFloatString(code: String, scriptName: String? = null, lineNumber: Int = 0, listener: OnExceptionListener): Float?

    fun evalDoubleString(code: String, scriptName: String? = null, lineNumber: Int = 0, listener: OnExceptionListener): Double?

    fun evalBooleanString(code: String, scriptName: String? = null, lineNumber: Int = 0, listener: OnExceptionListener): Boolean?


}