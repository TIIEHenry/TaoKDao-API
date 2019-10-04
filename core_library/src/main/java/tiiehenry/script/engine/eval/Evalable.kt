package tiiehenry.script.engine.eval

import tiiehenry.script.engine.framework.ScriptEngine

interface Evalable<T : ScriptEngine> {
    val engine: T
}