package tiiehenry.script.engine.android

import android.os.Handler
import android.os.Message

class ScriptMainHandler(val scriptContext: ScriptContext<*>) : Handler() {
    override fun handleMessage(msg: Message) {
        super.handleMessage(msg)
        when (msg.what) {
            TOAST -> scriptContext.showToast(msg.obj.toString())
        }
    }

    companion object {
        val TOAST = "toast".hashCode()
    }
}