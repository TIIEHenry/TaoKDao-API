package tiiehenry.script.engine.internal

import tiiehenry.script.engine.framework.ScriptEngine


abstract class Printer<T : ScriptEngine>(engine: T) : Logger<T>(engine),Printable<T> {

}
