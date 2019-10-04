package tiiehenry.script.engine.android

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import tiiehenry.script.engine.framework.ScriptEngine
import tiiehenry.script.engine.framework.ScriptProvider

abstract class ScriptActivity<A:Activity,T: ScriptEngine> : Activity(), ScriptContextActivity<A, T> {
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
//        engine.v8Requirer.require()
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