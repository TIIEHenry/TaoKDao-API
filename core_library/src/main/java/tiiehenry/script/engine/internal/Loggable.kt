package tiiehenry.script.engine.internal

import android.util.Log
import tiiehenry.script.engine.framework.ScriptEngine

interface Loggable<T : ScriptEngine> {
    val logTag: String
    val engine: T

    fun logi(s: Any?) {
        Log.i(logTag, s.toString())
    }


    fun logd(s: Any?) {
        Log.d(logTag, s.toString())
    }


    fun logw(s: Any?) {
        Log.w(logTag, s.toString())
    }


    fun loge(s: Any?) {
        Log.e(logTag, s.toString())
    }

    fun log(s: Any?) {
        logi(s)
    }


    fun logri(id: Int) {
        Log.i(logTag, engine.scriptContext.getContext().getString(id))
    }


    fun logrd(id: Int) {
        Log.d(logTag, engine.scriptContext.getContext().getString(id))
    }


    fun logrw(id: Int) {
        Log.w(logTag, engine.scriptContext.getContext().getString(id))
    }


    fun logre(id: Int) {
        Log.e(logTag, engine.scriptContext.getContext().getString(id))
    }

    fun logr(id: Int) {
        logri(id)
    }
}