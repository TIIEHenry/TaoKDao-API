package tiiehenry.script.engine.android

import java.io.File
import java.math.BigInteger
import java.security.MessageDigest
import java.util.*


class ScriptDexLoader(val scriptContext: ScriptContext<*>) {

    val scriptProvider = scriptContext.scriptProvider



    fun loadDex(dexFile: File): ScriptDexClassLoader? {
        if (!dexFile.exists())
            return null
        var path = dexFile.absolutePath
        var dex = scriptDexClassLoaderMap[path]
        if (dex == null) {
            getFileMD5(dexFile).let {
                if (it != "0")
                    path = it
            }
            dex = scriptDexClassLoaderMap[path]
            if (dex == null) {
                dex = ScriptDexClassLoader(path, scriptProvider.odexDir,  scriptProvider.nativeLibraryDir, scriptContext.getContext().classLoader)
                scriptDexClassLoaderMap[path] = dex
            }
        }

        return dex
    }

    fun getFileMD5(file: File): String {
        val digest = MessageDigest.getInstance("MD5")
        val bigInt = BigInteger(1, digest.digest(file.readBytes()))
        return bigInt.toString(16)
    }


    companion object {
        //md5
        private val scriptDexClassLoaderMap = HashMap<String, ScriptDexClassLoader>()
    }

}