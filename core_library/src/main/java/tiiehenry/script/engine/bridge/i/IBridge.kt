package tiiehenry.script.engine.bridge.i

import tiiehenry.script.engine.framework.ScriptEngine

interface IBridge<T : ScriptEngine> {
    val engine: T
}