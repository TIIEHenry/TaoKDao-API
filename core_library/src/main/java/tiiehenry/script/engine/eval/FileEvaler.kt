package tiiehenry.script.engine.eval

import tiiehenry.script.engine.framework.ScriptEngine
import java.io.File

open class FileEvaler<T : ScriptEngine>(override val engine: T) : Evaler(engine), FileEvalable<T> {

    override fun evalFile(path: String,listener: OnExceptionListener): Any? {
        return evalFile(File(path),listener)
    }

    override fun evalFile(file: File,listener: OnExceptionListener): Any? {
        return engine.stringEvaler.evalString(file.readText(), file.name,0,listener)
    }

    override fun evalVoidFile(path: String,listener: OnExceptionListener) {
        evalVoidFile(File(path),listener)
    }

    override fun evalVoidFile(file: File,listener: OnExceptionListener) {
        engine.stringEvaler.evalVoidString(file.readText(), file.name,0,listener)
    }

    override fun evalStringFile(path: String,listener: OnExceptionListener): String? {
        return evalStringFile(File(path),listener)
    }

    override fun evalStringFile(file: File,listener: OnExceptionListener): String? {
        return engine.stringEvaler.evalStringString(file.readText(), file.name,0,listener)
    }

    override fun evalIntegerFile(path: String,listener: OnExceptionListener): Int? {
        return evalIntegerFile(File(path),listener)
    }

    override fun evalIntegerFile(file: File,listener: OnExceptionListener): Int? {
        return engine.stringEvaler.evalIntegerString(file.readText(), file.name,0,listener)
    }

    override fun evalFloatFile(path: String,listener: OnExceptionListener): Float? {
        return evalFloatFile(File(path),listener)
    }

    override fun evalFloatFile(file: File,listener: OnExceptionListener): Float? {
        return engine.stringEvaler.evalFloatString(file.readText(), file.name,0,listener)
    }

    override fun evalDoubleFile(path: String,listener: OnExceptionListener): Double? {
        return evalDoubleFile(File(path),listener)
    }

    override fun evalDoubleFile(file: File,listener: OnExceptionListener): Double? {
        return engine.stringEvaler.evalDoubleString(file.readText(), file.name,0,listener)
    }


    override fun evalBooleanFile(path: String,listener: OnExceptionListener): Boolean? {
        return evalBooleanFile(File(path),listener)
    }

    override fun evalBooleanFile(file: File,listener: OnExceptionListener): Boolean? {
        return engine.stringEvaler.evalBooleanString(file.readText(), file.name,0,listener)
    }


    override fun evalFile(path: String): Any? {
        return evalFile(path, engine.onExceptionListener)
    }

    override fun evalFile(file: File): Any? {
        return evalFile(file,engine.onExceptionListener)
    }

    override fun evalVoidFile(path: String) {
        evalVoidFile(path, engine.onExceptionListener)
    }

    override fun evalVoidFile(file: File) {
        evalVoidFile(file, engine.onExceptionListener)
    }

    override fun evalStringFile(path: String): String? {
        return evalStringFile(path, engine.onExceptionListener)
    }

    override fun evalStringFile(file: File): String? {
        return evalStringFile(file, engine.onExceptionListener)
    }

    override fun evalIntegerFile(path: String): Int? {
        return evalIntegerFile(path, engine.onExceptionListener)
    }

    override fun evalIntegerFile(file: File): Int? {
        return evalIntegerFile(file, engine.onExceptionListener)
    }

    override fun evalFloatFile(path: String): Float? {
        return evalFloatFile(path, engine.onExceptionListener)
    }

    override fun evalFloatFile(file: File): Float? {
        return evalFloatFile(file, engine.onExceptionListener)
    }

    override fun evalDoubleFile(path: String): Double? {
        return evalDoubleFile(path, engine.onExceptionListener)
    }

    override fun evalDoubleFile(file: File): Double? {
        return evalDoubleFile(file, engine.onExceptionListener)
    }


    override fun evalBooleanFile(path: String): Boolean? {
        return evalBooleanFile(path, engine.onExceptionListener)
    }

    override fun evalBooleanFile(file: File): Boolean? {
        return evalBooleanFile(file, engine.onExceptionListener)
    }
}