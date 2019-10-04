package tiiehenry.script.engine.android

import android.app.Activity
import tiiehenry.script.engine.R
import tiiehenry.script.engine.framework.ScriptEngine

interface ScriptContextActivity<T : Activity,S: ScriptEngine> : ScriptContext<S> {
    fun getActivity(): T


    override fun onEngineInited() {
        super.onEngineInited()
//        engine.putVar("activity", getActivity())
    }

    fun overridePendingTransitionOpen() {
        getActivity().overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit)
    }

    fun overridePendingTransitionExit() {
        getActivity().overridePendingTransition(R.anim.activity_close_enter, R.anim.activity_close_exit)
    }
}