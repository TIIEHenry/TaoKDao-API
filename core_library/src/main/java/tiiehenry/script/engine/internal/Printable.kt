package tiiehenry.script.engine.internal

import tiiehenry.script.engine.framework.ScriptEngine

interface Printable<T : ScriptEngine> :Loggable<T>{

    fun printi(a: Any?) {
        printf(a)
        logi(a.toString())
    }


    fun printd(a: Any?) {
        printf(a)
        logd(a.toString())
    }

    fun printw(a: Any?) {
        printf(a)
        logw(a.toString())
    }

    fun printe(a: Any?) {
        printf(a)
        loge(a.toString())
    }

    fun printf(a: Any?) {
        print(a)
    }

    fun print(a: Any?) {
        engine.scriptContext.notifyShowToast(a.toString())
    }

    //res
    fun printri(id: Int) {
        printrf(id)
        logri(id)
    }

    fun printrd(id: Int) {
        printrf(id)
        logrd(id)
    }

    fun printrw(id: Int) {
        printrf(id)
        logrw(id)
    }

    fun printre(id: Int) {
        printrf(id)
        logre(id)
    }

    fun printrf(id: Int) {
        printr(id)
    }

    fun printr(id: Int) {
        engine.scriptContext.notifyShowToast(engine.scriptContext.getContext().getString(id))
    }
}