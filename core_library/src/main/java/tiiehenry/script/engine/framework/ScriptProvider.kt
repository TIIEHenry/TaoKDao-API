package tiiehenry.script.engine.framework

import android.content.Context
import tiiehenry.script.engine.android.ScriptContext

open class ScriptProvider<T : ScriptEngine>(val scriptContext: ScriptContext<T>) {

    val odexDir by lazy {
        scriptContext.getContext().getDir("odex", Context.MODE_PRIVATE).absolutePath
    }

    val soDir by lazy {
        scriptContext.getContext().getDir("so", Context.MODE_PRIVATE).absolutePath
    }

    val nativeLibraryDir by lazy {
        scriptContext.getContext().applicationInfo.nativeLibraryDir
    }

}