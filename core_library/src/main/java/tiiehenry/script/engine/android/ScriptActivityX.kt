package tiiehenry.script.engine.android

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import tiiehenry.script.engine.framework.ScriptEngine
import tiiehenry.script.engine.framework.ScriptProvider


abstract class ScriptActivityX<A: Activity,T: ScriptEngine>: AppCompatActivity(), ScriptContextActivity<A, T> {
    override val mainHandler: Handler = ScriptMainHandler(this)
    override val toastbuilder: StringBuilder = StringBuilder()
    override var lastShow: Long = 0


    override val scriptProvider= ScriptProvider(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        onCreateBeforeSuper(savedInstanceState)
        super.onCreate(savedInstanceState)
        engine.apply {
            init("main")
            onEngineInited()
        }
        onCreateAfterSuper(savedInstanceState)
    }


    override fun startActivity(intent: Intent?) {
        super.startActivity(intent)
        overridePendingTransitionOpen()
    }

    override fun onDestroy() {
        super.onDestroy()
        engine.destory()
    }

    override fun finish() {
        super.finish()
        overridePendingTransitionExit()
    }

    override fun getContext(): Context {
        return this
    }

}