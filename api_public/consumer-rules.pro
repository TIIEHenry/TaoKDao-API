-keep class taokdao.api.**
-keep interface taokdao.api.**
-keep enum taokdao.api.**

-keep class taokdao.api.**{
    *;
}
-keep interface taokdao.api.**{
    *;
}
-keep enum taokdao.api.**{
    *;
}

#
##Shrink: 删除没有被使用的类和方法。
#-dontshrink
##Optimize: 对代码指令进行优化。
##-dontoptimize
##Obfuscate: 对代码名称进行混淆。
#-dontobfuscate
# # 不进行预校验,Android不需要,可加快混淆速度。
#-dontpreverify
## 保护代码中的Annotation不被混淆
#-keepattributes *Annotation*
## 避免混淆泛型, 这在JSON实体映射时非常重要
#-keepattributes Signature
##抛出异常时保留代码行号，在异常分析中可以方便定位
#-keepattributes SourceFile,LineNumberTable
