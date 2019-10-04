package tiiehenry.script.engine.eval

import tiiehenry.script.engine.framework.ScriptEngine

abstract class StringEvaler<T : ScriptEngine>(override val engine: T) : Evaler(engine), StringEvalable<T> {


    override fun evalString(code: String, scriptName: String?, lineNumber: Int): Any? {
        return evalString(code, scriptName, lineNumber, engine.onExceptionListener)
    }

    override fun evalVoidString(code: String, scriptName: String?, lineNumber: Int) {
        evalVoidString(code, scriptName, lineNumber, engine.onExceptionListener)
    }

    override fun evalStringString(code: String, scriptName: String?, lineNumber: Int): String? {
        return evalStringString(code, scriptName, lineNumber, engine.onExceptionListener)
    }

    override fun evalIntegerString(code: String, scriptName: String?, lineNumber: Int): Int? {
        return evalIntegerString(code, scriptName, lineNumber, engine.onExceptionListener)
    }

    override fun evalFloatString(code: String, scriptName: String?, lineNumber: Int): Float? {
        return evalFloatString(code, scriptName, lineNumber, engine.onExceptionListener)
    }

    override fun evalDoubleString(code: String, scriptName: String?, lineNumber: Int): Double? {
        return evalDoubleString(code, scriptName, lineNumber, engine.onExceptionListener)
    }

    override fun evalBooleanString(code: String, scriptName: String?, lineNumber: Int): Boolean? {
        return evalBooleanString(code, scriptName, lineNumber, engine.onExceptionListener)
    }

}