package tiiehenry.script.engine.eval

import tiiehenry.script.engine.framework.ScriptEngine
import java.io.File

interface FileEvalable<T : ScriptEngine> : Evalable<T> {
    fun evalFile(path: String): Any?

    fun evalFile(file: File): Any?

    fun evalVoidFile(path: String)

    fun evalVoidFile(file: File)

    fun evalStringFile(path: String): String?

    fun evalStringFile(file: File): String?

    fun evalIntegerFile(path: String): Int?

    fun evalIntegerFile(file: File): Int?

    fun evalFloatFile(path: String): Float?

    fun evalFloatFile(file: File): Float?

    fun evalDoubleFile(path: String): Double?

    fun evalDoubleFile(file: File): Double?


    fun evalBooleanFile(path: String): Boolean?

    fun evalBooleanFile(file: File): Boolean?

    fun evalFile(path: String,listener: OnExceptionListener): Any?

    fun evalFile(file: File,listener: OnExceptionListener): Any?

    fun evalVoidFile(path: String,listener: OnExceptionListener)

    fun evalVoidFile(file: File,listener: OnExceptionListener)

    fun evalStringFile(path: String,listener: OnExceptionListener): String?

    fun evalStringFile(file: File,listener: OnExceptionListener): String?

    fun evalIntegerFile(path: String,listener: OnExceptionListener): Int?

    fun evalIntegerFile(file: File,listener: OnExceptionListener): Int?

    fun evalFloatFile(path: String,listener: OnExceptionListener): Float?

    fun evalFloatFile(file: File,listener: OnExceptionListener): Float?

    fun evalDoubleFile(path: String,listener: OnExceptionListener): Double?

    fun evalDoubleFile(file: File,listener: OnExceptionListener): Double?


    fun evalBooleanFile(path: String,listener: OnExceptionListener): Boolean?

    fun evalBooleanFile(file: File,listener: OnExceptionListener): Boolean?


}