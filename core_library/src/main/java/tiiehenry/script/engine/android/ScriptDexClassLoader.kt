package tiiehenry.script.engine.android

import dalvik.system.DexClassLoader



class ScriptDexClassLoader(val dexPath: String, optimizedDirectory: String, librarySearchPath: String, parent: ClassLoader) : DexClassLoader(dexPath, optimizedDirectory, librarySearchPath, parent) {
    private val classCache = HashMap<String,Class<*>>()


    @Throws(ClassNotFoundException::class)
    override fun findClass(name: String): Class<*>? {
        var cls = classCache[name]
        if (cls == null) {
            cls = super.findClass(name)
            classCache[name] = cls
        }
        return cls
    }

}